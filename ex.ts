const romanMap = new Map<string, number>();
romanMap.set("I", 1);
romanMap.set("V", 5);
romanMap.set("X", 10);
romanMap.set("L", 50);
romanMap.set("C", 100);
romanMap.set("D", 500);
romanMap.set("M", 1000);

/**
 * Converts a Roman numeral string to its integer equivalent.
 *
 * @param {string} s - The Roman numeral string to convert.
 * @returns {number} - The integer representation of the Roman numeral.
 * @throws {Error} - Throws an error if the string contains invalid Roman numeral characters.
 */
function romanToInt(s: string): number {
  let total = 0;
  total = s.split("").reduce((acc, char, i) => {
    const current = romanMap.get(char) ?? 0;
    if (current === 0) {
      throw new Error(`Invalid Roman numeral character: ${char}`);
    }
    const next = i + 1 < s.length ? romanMap.get(s.charAt(i + 1)) ?? 0 : 0;

    return current < next ? acc - current : acc + current;
  }, 0);
  return total;
}
