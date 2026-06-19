var largestAltitude = function(gain) {
    let currentaltitude = 0;
    let maxaltitude = 0;
    for (let i of gain) {
        currentaltitude += i;
        maxaltitude = Math.max(maxaltitude, currentaltitude);
    }
    return maxaltitude;
};