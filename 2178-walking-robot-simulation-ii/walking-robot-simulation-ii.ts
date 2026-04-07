class Robot {
    private dirs: string[] = ["East", "North", "West", "South"];
    private a: [number, number, number][] = [];
    private i: number = 0;

    constructor(W: number, H: number) {
        // Precompute the perimeter path with positions and directions
        for (let x = 0; x < W; x++) this.a.push([x, 0, 0]); // East
        for (let y = 1; y < H; y++) this.a.push([W - 1, y, 1]); // North
        for (let x = W - 2; x >= 0; x--) this.a.push([x, H - 1, 2]); // West
        for (let y = H - 2; y > 0; y--) this.a.push([0, y, 3]); // South
    }

    step(num: number): void {
        this.i = (this.i + num) % this.a.length; // Cycle through perimeter
        this.a[0][2] = 3; // Update direction to "South" when at (0,0)
    }

    getPos(): [number, number] {
        return this.a[this.i].slice(0, 2) as [number, number]; // Return x, y
    }

    getDir(): string {
        return this.dirs[this.a[this.i][2]]; // Return direction as a string
    }
}