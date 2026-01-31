class Solution {
    func nextGreatestLetter(_ letters: [Character], _ target: Character) -> Character {
        
        for letter in letters {
            if letter > target {
                return letter
            }
        }

        return letters[0]
    }
}