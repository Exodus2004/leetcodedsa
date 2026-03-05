function minOperations(s: string): number {
    // 0 1 0 0
    // 1 0 1 1

    let switch10 = 0;
    let switch01 = 0;

    for(let i = 0; i<s.length; i++) {
        if(i%2 == 0) {
            if(s[i] == "1") switch01++
            else switch10++
        } else {
            if(s[i] == "1") switch10++
            else switch01++
        }
    }
  
    return Math.min(switch01, switch10)
};