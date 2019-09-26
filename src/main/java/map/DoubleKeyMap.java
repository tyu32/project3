package map;

import java.util.List;

/** Your DoubleKeyHashMap class must implement this interface. The interface
 * is similar to Java's Map interface from the standard library, except this interface
 * has two keys as opposed to one key, and has a smaller set of methods.
 * Modified from the assignment of Prof. Parr.
 */
public interface DoubleKeyMap <K1, K2, V> {

    /** Add (key1, key2, value) to dictionary.
     * Will replace previous value that key1 and key2 mapped to.
     * If any  argument is null, throw IllegalArgumentException.
     *
     * @param key1 first key
     * @param key2 second key
     * @param value corresponding value
     */
    void put(K1 key1, K2 key2, V value);

    /** Return the value associated with (key1, key2). Return null if
     * no value exists for those keys.
     * If any key is null, throw IllegalArgumentException.
     *
     * @param key1 first key
     * @param key2 second key
     * @return value associated with (key1, key2)
     */
    V get(K1 key1, K2 key2);

    /** Remove a value if present. Return previous value if any.
     * Do nothing if not present and return null.
     * @param key1 first key
     * @param key2 second key
     * @return previous value
     */
    V remove(K1 key1, K2 key2);

    /** Return true if there is a value associated with the 2 keys
     *  else return false.
     *  key1, key2 must be non-null. If either is null, return false.
     *
     * @param key1 first key
     * @param key2 second key
     * @return true if an entry with key1 and key2 is present in the map.
     */
    boolean containsKey(K1 key1, K2 key2);

    /** Return a list of a values in the map.  Return an
     *  empty list if there are no values.
     * @return List of values.
     */
    List<V> values();

    /** Return how many elements there are in the dictionary.
     *
     * @return number of elements in the dictionary
     */
    int size();

    /** Clear the map so that it has no entries. */
    void clear();
}