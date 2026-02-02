function minimumCost(nums: number[], k: number, maxDistance: number): number {
    class MaxHeap {
        private heap: number[] = [];

        public size(): number {
            return this.heap.length;
        }

        public peek(): number | undefined {
            return this.heap[0];
        }

        public push(val: number): void {
            this.heap.push(val);
            this.bubbleUp();
        }

        public pop(): number | undefined {
            if (this.size() === 0) return undefined;

            const max = this.heap[0];
            const end = this.heap.pop();

            if (this.size() > 0 && end !== undefined) {
                this.heap[0] = end;
                this.bubbleDown();
            }

            return max;
        }

        public remove(val: number): void {
            const idx = this.heap.indexOf(val);
            if (idx === -1) return;

            const end = this.heap.pop();
            if (idx !== this.size() && end !== undefined) {
                this.heap[idx] = end;
                this.bubbleUp(idx);
                this.bubbleDown(idx);
            }
        }

        private bubbleUp(idx = this.size() - 1): void {
            const el = this.heap[idx];

            while (idx > 0) {
                const parentIdx = Math.floor((idx - 1) / 2);
                const parent = this.heap[parentIdx];
                if (el <= parent) break;

                this.heap[idx] = parent;
                idx = parentIdx;
            }

            this.heap[idx] = el;
        }

        private bubbleDown(idx = 0): void {
            const el = this.heap[idx];

            while (true) {
                let leftChildIdx = 2 * idx + 1;
                let rightChildIdx = 2 * idx + 2;
                let leftChild;
                let rightChild;
                let swap = null;

                if (leftChildIdx < this.size()) {
                    leftChild = this.heap[leftChildIdx];
                    if (leftChild > el) swap = leftChildIdx;
                }

                if (rightChildIdx < this.size()) {
                    rightChild = this.heap[rightChildIdx];

                    if (
                        (swap === null && rightChild > el) ||
                        (swap !== null && rightChild > leftChild!)
                    ) {
                        swap = rightChildIdx;
                    }
                }

                if (swap === null) break;
                this.heap[idx] = this.heap[swap];
                idx = swap;
            }

            this.heap[idx] = el;
        }
    }

    class MinHeap {
        private heap: number[] = [];

        public size(): number {
            return this.heap.length;
        }

        public peek(): number | undefined {
            return this.heap[0];
        }

        public push(val: number): void {
            this.heap.push(val);
            this.bubbleUp();
        }

        public pop(): number | undefined {
            if (this.size() === 0) return undefined;

            const min = this.heap[0];
            const end = this.heap.pop();

            if (this.size() > 0 && end !== undefined) {
                this.heap[0] = end;
                this.bubbleDown();
            }

            return min;
        }

        public remove(val: number): void {
            const idx = this.heap.indexOf(val);
            if (idx === -1) return;

            const end = this.heap.pop();
            if (idx !== this.size() && end !== undefined) {
                this.heap[idx] = end;
                this.bubbleUp(idx);
                this.bubbleDown(idx);
            }
        }

        private bubbleUp(idx: number = this.size() - 1): void {
            const el = this.heap[idx];

            while (idx > 0) {
                const parentIdx = Math.floor((idx - 1) / 2);
                const parent = this.heap[parentIdx];
                if (el >= parent) break;

                this.heap[idx] = parent;
                idx = parentIdx;
            }

            this.heap[idx] = el;
        }

        private bubbleDown(idx: number = 0): void {
            const el = this.heap[idx];

            while (true) {
                let leftChildIdx = 2 * idx + 1;
                let rightChildIdx = 2 * idx + 2;
                let leftChild;
                let rightChild;
                let swap = null;

                if (leftChildIdx < this.size()) {
                    leftChild = this.heap[leftChildIdx];
                    if (leftChild < el) swap = leftChildIdx;
                }

                if (rightChildIdx < this.size()) {
                    rightChild = this.heap[rightChildIdx];

                    if (
                        (swap === null && rightChild < el) ||
                        (swap !== null && rightChild < leftChild!)
                    ) {
                        swap = rightChildIdx;
                    }
                }

                if (swap === null) break;
                this.heap[idx] = this.heap[swap];
                idx = swap;
            }

            this.heap[idx] = el;
        }
    }

    if (k === 1) return nums[0];

    const subarr = nums.slice(1);
    const windowSize = maxDistance + 1;
    const maxHeap = new MaxHeap();
    const minHeap = new MinHeap();
    let maxHeapSum = 0;

    function insertElement(el: number) {
        if (maxHeap.size() < k - 1 || el <= maxHeap.peek()!) {
            maxHeap.push(el);
            maxHeapSum += el;
        }
        else {
            minHeap.push(el);
        }

        rebalanceHeaps();
    }

    function removeElement(el: number) {
        if (maxHeap.peek() === el) {
            maxHeap.pop();
            maxHeapSum -= el;
        }
        else if (minHeap.peek() === el) {
            minHeap.pop();
        }
        else if (maxHeap.size() > 0 && maxHeap.peek()! >= el) {
            maxHeap.remove(el);
            maxHeapSum -= el;
        }
        else {
            minHeap.remove(el);
        }

        rebalanceHeaps();
    }

    function rebalanceHeaps() {
        while (maxHeap.size() > k - 1) {
            const el = maxHeap.pop()!;
            minHeap.push(el);
            maxHeapSum -= el;
        }

        while (maxHeap.size() < k - 1 && minHeap.size() > 0) {
            const el = minHeap.pop()!;
            maxHeap.push(el);
            maxHeapSum += el;
        }
    }

    for (let i = 0; i < Math.min(windowSize, subarr.length); i++) {
        insertElement(subarr[i]);
    }

    let minCost = maxHeapSum;

    for (let left = 1; left <= subarr.length - windowSize; ++left) {
        const right = left + windowSize - 1;
        removeElement(subarr[left - 1]);
        insertElement(subarr[right]);
        minCost = Math.min(minCost, maxHeapSum);
    }

    return nums[0] + minCost;
};
