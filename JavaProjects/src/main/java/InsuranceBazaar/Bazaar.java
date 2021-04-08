package InsuranceBazaar;

import java.util.*;


public class Bazaar {
	
	private Map<Integer,String> policyMap;
	
	public Map<Integer, String> getPolicyMap() {
		return policyMap;
	}

	public void setPolicyMap(Map<Integer, String> policyMap) {
		this.policyMap = policyMap;
	}

	//This method should add the policyID as key and policyName as value into the policyMap
	public void addPolicyDetails(int policyId,String policyName)
	{
		policyMap.put(policyId, policyName);
	}
	
	/*
	 * This method should search the policy name based on the policy type and add those policy names
	 * into the list and return the list.
	 * For example: If the map contains the key and value as:
	 *  10654 Max Bupa Health Insurance
	    10321 SBI Health Insurance
	    20145 IFFCO Tokio Two Wheeler Insurance
	    20165 New India Assurance Two Wheeler Insurance
	    10110 Reliance Health Insurance
		if the policy type is Health the output should be
		10110
		10321
		10654

	 */
	public static int subpart(String str1, String str2){
        int pos = 0, len = str1.length();
        
        for(int i = 0; i < len; i++) {
            if(pos == str2.length()) 
                break;
            if(str1.charAt(i) == str2.charAt(pos)) 
                pos++;
            else
                pos = 0;
        }
        
        int flag;
        if(pos < str2.length())
            flag = 0;
        flag = 1;
        return flag;
    }
	 
	public List<Integer> searchBasedOnPolicyType(String policyType){
	    List<Integer> list = new ArrayList<Integer>();
		for(Map.Entry<Integer, String> mp : policyMap.entrySet()){
		    if(subpart(mp.getValue(), policyType) == 1) 
		        list.add(mp.getKey());
		} 
		return list;
	}
	

}

