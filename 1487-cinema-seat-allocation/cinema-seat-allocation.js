/**
 * @param {number} n
 * @param {number[][]} reservedSeats
 * @return {number}
 */
var maxNumberOfFamilies = function (n, reservedSeats) {
    let block1 = new Set([2, 3, 4, 5]), block2 = new Set([4, 5, 6, 7]), block3 = new Set([6, 7, 8, 9]), rs = 0;
    let sorted = reservedSeats.sort((a, b) => a[0] - b[0]), j = 0;

    while (j < sorted.length) {
        let c1 = 4, c2 = 4, c3 = 4;
        let i = sorted[j][0];
        n-=1;
        while (j < sorted.length&&sorted[j][0] == i) {
            let r = sorted[j][1];
            if (block1.has(r)) {
                c1 -= 1;
            }
            if (block2.has(r)) {
                c2 -= 1;
            }
            if (block3.has(r)) {
                c3 -= 1;
            }
            j += 1;
        }
        if (c1 == 4 && c2 == 4 && c3 == 4) {
            rs += 2;
        } else if (c1 == 4 && c2 == 4) {
            rs += 1;
        } else if (c3 == 4 && c2 == 4) {
            rs += 1;
        } else if (c1 == 4 && c3 == 4) {
            rs += 2;
        } else if (c1 == 4) {
            rs += 1;
        } else if (c2 == 4) {
            rs += 1;
        } else if (c3 == 4) {
            rs += 1;
        }
    }

    return rs+(n*2);
};