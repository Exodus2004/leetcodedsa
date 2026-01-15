/**
 * Definition for singly-linked list.
 * function ListNode(val, next) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.next = (next===undefined ? null : next)
 * }
 */
/**
 * @param {ListNode} head
 * @return {number[]}
 */

var nextLargerNodes = function(head) {

    const res = [];
    const stack = []; // stores [index, value] pairs
    let curr = head;
    let index = 0;

    while (curr) {
        // Resolve any previous nodes with smaller values
        while (stack.length && curr.val > stack.at(-1)[1]) {
            const [prevIndex, _] = stack.pop();
            res[prevIndex] = curr.val;
        }

        // Push current node index and value
        stack.push([index, curr.val]);
        res.push(0); // default value, may be updated later
        curr = curr.next;
        index++;
    }

    return res;
};