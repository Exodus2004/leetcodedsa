function checkStrings(s1: string, s2: string): boolean {
    const countEven = new Array(26).fill(0);
    const countOdd = new Array(26).fill(0);

    for (let i = 0; i < s1.length; i++) {
        const char1 = s1.charCodeAt(i) - 97;
        const char2 = s2.charCodeAt(i) - 97;

        if (i % 2 === 0) {
            countEven[char1]++;
            countEven[char2]--;
        } else {
            countOdd[char1]++;
            countOdd[char2]--;
        }
    }

    for (let i = 0; i < 26; i++) {
        if (countEven[i] !== 0 || countOdd[i] !== 0) {
            return false;
        }
    }

    return true;
}