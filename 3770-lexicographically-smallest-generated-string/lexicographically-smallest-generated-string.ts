function generateString(str1: string, str2: string): string {
    const n = str1.length, m = str2.length, L = n+m-1;

    const solution = new Array<string | undefined>(L);
    const fixed = new Array<boolean>(L).fill(false);

    // 1. Set initial substrings if str1[i] == 'T'
    for (let i=0; i<n; i++) {
        if (str1[i] !== "T") continue;

        for (let j=0; j<m; j++) {
            const pos = i+j;
            const need = str2[j];
            if (solution[pos] && solution[pos] !== need) {
                return "" 
            }
            solution[pos] = need;
            fixed[pos] = true;
        }
    }

    // 2. Check for unsatisfiable criteria when str1[i] == 'F'
    for (let i=0; i<n; i++) {
        if (str1[i] !== "F") continue;

        const windowMatch = windowMatchesAt(solution, str2, i)
        if (windowMatch) return ""
    }

    // 3. Fill in unset solutions with 'a'
    for (let i=0; i<L; i++) {
        if (!solution[i]) solution[i] = "a";
    }

    //  4. Check for unsatisfiable criteria when str1[i] == 'F'
    for (let i=0; i<n; i++) {
        if (str1[i] !== "F") continue;

        const windowMatch = windowMatchesAt(solution, str2, i)
        if (!windowMatch) continue

        let flipped = false;
        for (let j=i+m-1; j>=i; j--) {
            if (!fixed[j]) {
                solution[j] = "b";
                fixed[j] = true;
                flipped = true
                break;
            }
        }
        if (!flipped) return "";
    }

    return solution.join("")
};

function windowMatchesAt(solution: Array<string | undefined>, str2: string, i: number) {
    return str2.split("").every((char, j) => solution[i+j] === char)
}