package InsuranceBazaar;

import java.util.*;

public class UserInterface {

	@SuppressWarnings({ "resource", "rawtypes" })
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		//Fill the UI code
		Bazaar b = new Bazaar();
		System.out.println("Enter the no of Policy names you want to store");
        int n = sc.nextInt();
        Map<Integer, String> hm = new HashMap<Integer, String>();
        
        for(int i = 0; i < n; i++){
		    System.out.println("Enter the Policy ID");
		    int id = sc.nextInt();
		    sc.nextLine();
		    System.out.println("Enter the Policy Name");
		    String pname = sc.nextLine();
		    hm.put(id, pname);
		}
		
		b.setPolicyMap(hm);
		Map<Integer,String> policyMap = b.getPolicyMap();
		TreeMap<Integer, String> tm = new TreeMap<Integer, String>(policyMap); 
        Iterator itr = tm.keySet().iterator();  
        
        while(itr.hasNext()){    
            int key = (int)itr.next();  
            System.out.println(key  +" "+policyMap.get(key));  
        }
        
        System.out.println("Enter the policy type to be searched");
        String ptype = sc.nextLine();
        List<Integer> l = b.searchBasedOnPolicyType(ptype);
        Collections.sort(l);
        for(int i = 0; i < l.size(); i++) 
            System.out.println(l.get(i));
	}
}

