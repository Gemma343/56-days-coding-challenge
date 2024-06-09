

class RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        // Create a HashMap to count the frequency of each letter in the magazine
        Map<Character, Integer> magazineCount = new HashMap<>();
        for (char c : magazine.toCharArray()) {
            magazineCount.put(c, magazineCount.getOrDefault(c, 0) + 1);
        }

        // Iterate through the ransom note and check if each letter can be constructed
        for (char c : ransomNote.toCharArray()) {
            if (!magazineCount.containsKey(c) || magazineCount.get(c) == 0) {
                return false;
            }
            magazineCount.put(c, magazineCount.get(c) - 1);
        }

        return true;
    }
}