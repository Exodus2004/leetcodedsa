function findTheString(lcp: number[][]): string {
    const n = lcp.length;
    let result = new Array(n).fill("1").join(""); // Initialize the result with '1'

    // Check for invalid LCP matrix conditions
    for (let i = 0; i < n; i++) {
        for (let j = 0; j < n; j++) {
            // Symmetry and bounds check
            if (lcp[i][j] !== lcp[j][i] || lcp[i][j] > n - Math.max(i, j)) {
                return "";
            }
            // Consistency of consecutive elements
            if (i + 1 < n && j + 1 < n && lcp[i][j] > 0 && lcp[i + 1][j + 1] !== lcp[i][j] - 1) {
                return "";
            }
        }
    }

    let t = 0; // Counter for unique characters (up to 26 for 'a' to 'z')

    // Assign characters based on LCP matrix
    for (let i = 0; i < n; i++) {
        let flag = false;
        for (let j = i; j < n; j++) {
            if (result[j] === "1" && lcp[i][j] !== 0) {
                if (t >= 26) return ""; // Not enough unique characters available
                result = result.slice(0, j) + String.fromCharCode(97 + t) + result.slice(j + 1);
                flag = true;
            }
        }
        if (flag) t++; // Move to the next character
    }

    // Validate the constructed string against the LCP matrix
    for (let i = 0; i < n; i++) {
        for (let j = 0; j < n; j++) {
            let actualLCP = 0;
            while (
                i + actualLCP < n &&
                j + actualLCP < n &&
                result[i + actualLCP] === result[j + actualLCP]
            ) {
                actualLCP++;
            }
            if (actualLCP !== lcp[i][j]) {
                return "";
            }
        }
    }

    return result;
}

