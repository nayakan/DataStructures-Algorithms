import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
 * All DNA is composed of a series of nucleotides abbreviated as A, C, G, and T, for example: "ACGAATTCCG". 
 * When studying DNA, it is sometimes useful to identify repeated sequences within the DNA.
 * Write a function to find all the 10-letter-long sequences (substrings) that occur more than once in a DNA molecule.
 * For example,
 * Given s = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT",
 * Return:["AAAAACCCCC", "CCCCCAAAAA"].
 */

public class DNASequence {
    public List<String> findRepeatedDnaSequences(String s) {
        Set<String> visited = new HashSet<>();
        Set<String> repeated = new HashSet<>();
        
        for(int i = 0; i + 9 < s.length(); i++) {
            String sub = s.substring(i, i + 10);
            
            if(!visited.add(sub))
                repeated.add(sub);
        }
        return new ArrayList(repeated);
    } 
}
