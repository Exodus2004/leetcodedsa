// sieve of eratosthenes
const MAX_RANGE = 10**6 + 1;
const prime = new Array(MAX_RANGE).fill(true);
prime[0] = prime[1] = false;

for (let i = 2; i * i < MAX_RANGE; i++) {
    if (prime[i] === true) {
        for (let j = i * i; j < MAX_RANGE; j += i) {
            prime[j] = false;
        }
    }
}


/**
 * @param {number[]} nums
 * @return {number}
 */
var minJumps = function(nums) {
    const n = nums.length;

    let maxi = 0;
    const val_to_index = {}; // Use an object as a hash map
    for (let i = 0; i < n; i++) {
        maxi = Math.max(maxi, nums[i]);
        if (!val_to_index[nums[i]]) {
            val_to_index[nums[i]] = [];
        }
        val_to_index[nums[i]].push(i);
    }

    const visited = new Set(); // To keep track of visited prime numbers
    const dist = new Array(n).fill(Infinity);
    dist[0] = 0;

    const q = []; // Use an array as a queue for BFS
    q.push(0);


    while (q.length > 0) {
        const node = q.shift(); // Dequeue the current node index

        // visit the left node, if left node exists
        if (node - 1 >= 0 && dist[node - 1] === Infinity) {
            q.push(node - 1);
            dist[node - 1] = 1 + dist[node];
        }

        // visit the right node
        if (node + 1 < n && dist[node + 1] === Infinity) {
            q.push(node + 1);
            dist[node + 1] = 1 + dist[node];
        }

        // visit the multipliers, if its prime and its not in visited set
        if (prime[nums[node]] === false || visited.has(nums[node])) {
            continue;
        }


        let i = 1;
        while (true) {
            const new_node = nums[node] * i;
            if (new_node > maxi) {
                break;
            }

            if (val_to_index[new_node]) { // Check if any index has this multiple value
                for (const new_node_index of val_to_index[new_node]) {
                    if (dist[new_node_index] === Infinity) {
                        q.push(new_node_index);
                        dist[new_node_index] = 1 + dist[node];
                    }
                }
            }
            i += 1;
        }

        visited.add(nums[node]); // Mark this prime number's value as processed

        if (dist[n - 1] !== Infinity) { // Early exit if destination is reached
            break;
        }
    }
    
    return dist[n-1];
};