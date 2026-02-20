function makeLargestSpecial(s: string): string {
    // Helper function to split the string into special substrings
    const splitSpecial = (s: string): string[] => {
        let cnt = 0;
        let start = 0;
        const res: string[] = [];

        for (let i = 0; i < s.length; i++) {
            cnt += s[i] === '1' ? 1 : -1;

            if (cnt === 0) {
                res.push('1' + makeLargestSpecial(s.slice(start + 1, i)) + '0');
                start = i + 1;
            }
        }

        return res;
    };

    // Split the string into special substrings
    const specialSubstrings = splitSpecial(s);
    // Sort the substrings in descending order
    specialSubstrings.sort((a, b) => b.localeCompare(a));
    // Join the sorted substrings to form the largest special string
    return specialSubstrings.join('');
};