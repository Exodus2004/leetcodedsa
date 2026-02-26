function numSteps(s: string): number {
    var dec = BigInt("0b" + s);
    var count = 0;
    while (dec != BigInt(1)) {
        if (BigInt(dec) % BigInt(2) == BigInt(0))
            dec = dec / BigInt(2);
        else
            dec += BigInt(1);
        count += 1;
    }
    return count;
};