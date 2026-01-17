function minMutation(startGene: string, endGene: string, bank: string[]): number {
    const validGenes: string[] = ["A", "C", "G", "T"];
    const geneBank = new Set<string>(bank);
    if (!geneBank.has(endGene)) { return -1; }
    const queue: [string, number][] = [[startGene, 0]];
    const visited = new Set<string>([startGene]);
    
    while (queue.length > 0) {
        const [currentGene, mutations] = queue.shift()!;
        if (currentGene === endGene) {
            return mutations;
        }
        for (let i: number = 0; i < currentGene.length; i++) {
            for (let char of validGenes) {
                if (char !== currentGene[i]) {
                    const newGene = currentGene.slice(0, i) + char + currentGene.slice(i + 1);
                    
                    if (geneBank.has(newGene) && !visited.has(newGene)) {
                        queue.push([newGene, mutations + 1]);
                        visited.add(newGene);
                    }
                }
            }
        }
    }
    return -1;      
};