// n 层 三叉树叶子节点数量（带剪枝
function getHappyString(n: number, k: number): string {
    let max = 3 << (n - 1)
    if (k > max) {
        return ""
    }
    let m = {
        'a': ['b', 'c'],
        'b': ['a', 'c'],
        'c': ['a', 'b']
    }
    // 其实也是一种 二叉树, 三根二叉树， (k - 1) / 3 << (n - 1) / 3)
    let ki = (k - 1) % (max / 3), res = ['a', 'b', 'c'][Math.floor((k - 1) * 3 / max)]
    for (let o = 2**(n - 1) >> 1, c = res; o; o >>= 1) {
        c = m[c][o & ki ? 1 : 0]
        res += c
    }
    return res;
};