function minNumberOfSeconds(mountainHeight: number, workerTimes: number[]): number {
    const maxWorkerTime = Math.max(...workerTimes)
    let maxValidSeconds = 0
    for (let height = 1; height <= mountainHeight; height++) {
        maxValidSeconds += maxWorkerTime * height
    }

    let left = 1, right = maxValidSeconds
    // console.log("maxValidSeconds", maxValidSeconds)
    while (left <= right) {
        const mid = left + Math.floor((right - left) / 2)
        const reducedHeight = calcReducableHeight(mid, workerTimes)
        // console.log("reducedHeight", reducedHeight)
        // console.log(left, right)
        if (reducedHeight >= mountainHeight) {
            right = mid - 1
        } else {
            left = mid + 1
        }
    }

    return left
};

function calcReducableHeight(totalTime: number, workerTimes: number[]): number {
    let totalHeight = 0
    for (const w of workerTimes) {
        const val = (2 * totalTime) / w;
        const k = Math.floor((-1 + Math.sqrt(1 + 4 * val)) / 2);
        totalHeight += k
    }

    return totalHeight
}