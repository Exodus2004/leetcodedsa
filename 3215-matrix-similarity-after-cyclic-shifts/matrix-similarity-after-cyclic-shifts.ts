function areSimilar(mat: number[][], k: number): boolean {
    const x = Array.from({ length: mat.length }, () => Array(mat[0].length))
    for (let i = 0; i < mat.length; i++) {
        let o = false
        if (i % 2 !== 0) {
            o = true
        }
        for (let j = 0; j < mat[i].length; j++) {
            let t = j
            for (let l = 0; l < k; l++) {
                if (o) {
                    t++
                    if (t === mat[i].length) {
                        t = 0
                    }
                } else {
                    t--
                    if (t === -1) {
                        t = mat[i].length - 1
                    }
                }
            }
            x[i][t] = mat[i][j]
        }
    }
    for (let i = 0; i < x.length; i++) {
        for (let j = 0; j < x[i].length; j++) {
            if (x[i][j] !== mat[i][j]) {
                return false
            }
        }
    }
    return true
};