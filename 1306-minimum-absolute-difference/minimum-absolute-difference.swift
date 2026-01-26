class Solution {
    func minimumAbsDifference(_ arr: [Int]) -> [[Int]] {
        var result: [[Int]] = []
        let sorted = arr.sorted()
        var minimumDifference = Int.max

        for index in 0..<arr.count - 1 {
            let first = sorted[index]
            let second = sorted[index + 1]

            let difference = max(first, second) - min(first, second)

            if difference < minimumDifference {
                minimumDifference = difference
                result = [[first, second]]
            } else if difference == minimumDifference {
                result.append([first, second])
            }
        }

        return result
    }
}