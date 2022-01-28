package CodingBlocks.src;

import java.util.*;

public class Playing_With_Cards {
    public static List<Integer> sieveOfEratosthenes(int n) {
        boolean prime[] = new boolean[n + 1];
        Arrays.fill(prime, true);
        for (int p = 2; p * p <= n; p++) {
            if (prime[p]) {
                for (int i = p * 2; i <= n; i += p) {
                    prime[i] = false;
                }
            }
        }
        List<Integer> primeNumbers = new LinkedList<>();
        for (int i = 2; i <= n; i++) {
            if (prime[i]) {
                primeNumbers.add(i);
            }
        }
        return primeNumbers;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int q = scan.nextInt();
        while(q > n) {
            q = scan.nextInt();
        }
        Stack<Integer> a = new Stack<>();
        List<Stack<Integer>> blist = new ArrayList<>();
        List<Stack<Integer>> alist = new ArrayList<>();

        for(int i =0; i < n;i++) {
            int temp = scan.nextInt();
            a.push(temp);
        }

        List<Integer> primeNo = sieveOfEratosthenes(q);
        int len = 2;
        while(primeNo.size() < q) {
            List<Integer> primeNos = sieveOfEratosthenes(q*len);
            len = len + 2;
            primeNo = primeNos;
        }
        primeNo = primeNo.subList(0, q);

        for(Integer i : primeNo) {
            Stack<Integer> b = new Stack<>();
            Stack<Integer> c = new Stack<>();
            for(int j = a.size()-1; j >= 0; j--) {
                if((a.get(j) % i) == 0) {
                    b.push(a.get(j));
                    a.removeElementAt(j);
                }else {
                    c.push(a.get(j));
                }
            }
            blist.add(b);
            alist.add(c);
            a = c;
        }

        for(int i = 0; i<primeNo.size();i++) {
            while(!blist.get(i).isEmpty()) {
                System.out.println(blist.get(i).pop());
            }
        }
        while(!alist.get(alist.size()-1).isEmpty()) {
            System.out.println(alist.get(alist.size()-1).pop());
        }
        scan.close();
    }
}
