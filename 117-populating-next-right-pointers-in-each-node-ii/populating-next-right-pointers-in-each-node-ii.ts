function connect(root: _Node | null): _Node | null {
    if(root===null || (root.left===null && root.right === null)) {
        return root;
    }
    let v = [];

    v.push([root]);
    let i = 0;
    while (i<v.length) {
        let temp = [];

        for(let j=0; j<v[i].length; j++) {
            if(v[i][j].left) temp.push(v[i][j].left);
            if(v[i][j].right) temp.push(v[i][j].right);
        }

        if(temp.length>0) v.push(temp);

        for(let j=0; j<temp.length; j++){
            if(j==temp.length-1) temp[j].next = null;
            else{
                temp[j].next = temp[j+1]
            }
        }

        i++;
    }

    return root;

};