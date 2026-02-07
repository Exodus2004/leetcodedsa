function minimumDeletions(s: string): number {
    let totalACount = 0; 

    for (let i = 0; i < s.length; i++) {
        let char = s[i]

        if (char === 'a') totalACount++; 
    }

    let leftBCount = 0; 
    let leftACount = 0; 

    let min = Infinity; 
    for (let i = -1; i < s.length + 1; i++) {
        if (s[i] === 'a') leftACount++; 
        if (s[i] === 'b') leftBCount++; 

        min = Math.min(min, (totalACount - leftACount) + leftBCount);
    }
    return min; 
};