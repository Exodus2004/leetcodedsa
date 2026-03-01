function minPartitions(n: string): number {
    let ans : number = 0;
    for(let i = 0; i < n.length; i++){
        ans = Math.max(ans, Number(n[i]))
    }
    return ans
};