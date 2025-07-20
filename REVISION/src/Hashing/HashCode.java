package Hashing;
import java.util.*;
public class HashCode {
    static class HashMap<K,V> {
        class Node {
            K key;
            V value;
            public Node(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }

        private int n; //no. of nodes in list
        private int N; // buckets.length
        private LinkedList<Node>[] buckets; // array of LinkedList

        public HashMap() {
            this.N = 4;
            this.buckets = new LinkedList[4]; //no need to define LL type here
            for (int i=0; i<buckets.length ; i++ ) {
                this.buckets[i] = new LinkedList<>(); //Doubt- corrected
            }
        }
		/*write methods here - put(hashFunction,searchInLL,rehash,get,containsKey,
		remove,isEmpty,keySet)*/

        public void put(K key, V val) {
            int bi = hashFunction(key);
            int di = searchInLL(key,bi);

            if(di==-1) { // key doesn't exist so create and n++
                buckets[bi].add(new Node(key,val));
                n++;
            }
            else { //key exists (update) - get node then put val
                Node node = buckets[bi].get(di);
                node.value = val;
            }

            double lambda = (double) n/N;
            if(lambda>2.0) {
                rehash();
            }
        }

        public int hashFunction(K key) {
            int bi = key.hashCode();
            return Math.abs(bi)%N;
        }

        public int searchInLL(K key, int bi) {
            // naam kya hai search in LL to linkedList lo aur usme khojo
            LinkedList<Node> list = buckets[bi];
            for (int i=0; i<list.size() ; i++ ) {
                if(list.get(i).key == key) { //at list.get(i) there is a node
                    return i;
                }
            }
            return -1;
        }

        public void rehash() { // until you feel the concept you can't code
            LinkedList<Node>[] oldBucket = buckets;
            buckets = new LinkedList[N*2];
            //got Doubt- cleared
            for (int i=0; i<N*2 ; i++ ) {
                buckets[i] = new LinkedList<>();
            }
            //Important - oldBucket tak ka wapas daalo new me
            for (int i=0; i<oldBucket.length ; i++ ) {
                LinkedList<Node> list = oldBucket[i];
                for (int j=0; j<list.size() ; j++ ) {
                    // dont memorise this please!
                    // hum kya add karenge obviously ek ek karke old nodes ke keys
                    //aur values hi daalenge na
                    Node node = list.get(j);
                    put(node.key,node.value);
                }
            }
        }

        public V get(K key) {
            // Dont memorise-think kaha jana hoga particular key ke value ke liye
            int bi = hashFunction(key);
            int di = searchInLL(key,bi);

            if(di==-1) {
                return null;
            }
            Node node = buckets[bi].get(di);
            return node.value;
        }
        public boolean containsKey(K key) {
            int bi = hashFunction(key);
            int di = searchInLL(key,bi);
            if(di==-1) {
                return false;
            }
            return true;
        }

        public void remove(K key) {
            int bi = hashFunction(key);
            int di = searchInLL(key,bi);

            if(di==-1) {
                return;
            }
            buckets[bi].remove(di);
        }

        //Important
        public ArrayList<K> keySet() { //doubt- cleared (ArrayList contains Key)
            ArrayList<K> keys = new ArrayList<>();
            for (int i=0; i<buckets.length ; i++ ) {
                //Doubt - Important
                LinkedList<Node> list = buckets[i]; // saare index ka list lo
                for (int j=0; j<list.size() ; j++ ) {
                    Node node = list.get(j);    // saara nodes nikalo ab list se
                    keys.add(node.key);         // add kr do keys list mein
                }
            }
            return keys;
        }
    }
    public static void main (String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("China",200);
        map.put("India",300);
        map.put("USA",400);
        map.put("UK",500);
        map.put("India",900);

        ArrayList<String> keys = map.keySet();
        for (int i=0; i<keys.size() ; i++ ) {
            System.out.println(keys.get(i)+" "+ map.get(keys.get(i)));
        }
        map.remove("China");
        System.out.println(map.get("China"));
    }
}
