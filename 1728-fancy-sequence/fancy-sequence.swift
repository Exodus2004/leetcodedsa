class Fancy {
    private let mod: Int64 = 1_000_000_007
    
    private var values = [(Int64, Int64, Int64)]()
    private var mul: Int64 = 1
    private var add: Int64 = 0

    init() {}

    func append(_ val: Int) {
        values.append((Int64(val), mul, add))
    }

    func addAll(_ inc: Int) {
        add = (add + Int64(inc)) % mod
    }

    func multAll(_ m: Int) {
        let mm = Int64(m)
        mul = (mul * mm) % mod
        add = (add * mm) % mod
    }

    func getIndex(_ idx: Int) -> Int {
        guard idx < values.count else { return -1 }

        let (val, mulAtInsert, addAtInsert) = values[idx]

        let inv = modPow(mulAtInsert, mod - 2)
        let factor = (mul * inv) % mod

        let result = (
            (val * factor) % mod +
            (add - (addAtInsert * factor) % mod + mod)
        ) % mod

        return Int(result)
    }

    private func modPow(_ a: Int64, _ b: Int64) -> Int64 {
        var base = a
        var exp = b
        var res: Int64 = 1

        while exp > 0 {
            if exp & 1 == 1 {
                res = (res * base) % mod
            }
            base = (base * base) % mod
            exp >>= 1
        }

        return res
    }
}