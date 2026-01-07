// 5 ms recursion + iteration
const dfsSum = (r) => {
    if (r.left) {
        dfsSum(r.left);
        r.val += r.left.val;
    }
    if (r.right) {
        dfsSum(r.right);
        r.val += r.right.val;
    }
}

const maxProduct = (root) => {
    dfsSum(root);

    let totalSum = root.val;
    let max = 0;
    const stack = [root];
    while (stack.length) {
        const r = stack.pop();
        if (r.left) {
            const subSum = r.left.val;
            max = Math.max(max, subSum * (totalSum - subSum));
            stack.push(r.left);
        }
        if (r.right) {
            const subSum = r.right.val;
            max = Math.max(max, subSum * (totalSum - subSum));
            stack.push(r.right);
        }
    }
    return max % (1e9 + 7);
};