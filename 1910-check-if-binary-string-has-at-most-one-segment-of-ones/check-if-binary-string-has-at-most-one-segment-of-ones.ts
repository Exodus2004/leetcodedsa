function checkOnesSegment(s: string): boolean {
    let b = false, b2 = false
    for (let i = 0; i < s.length; i++) {
        if (s[i] === '1') {
            b = true
            if (b2 && b) {
                return false
            }
        } else {
            if (b) {
                b2 = true
            }
        }
    }
    return true
};