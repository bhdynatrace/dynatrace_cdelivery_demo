package cdelivery_demo;

import java.util.ArrayList;

public class accounts {
		ArrayList<account> account_list;
		
		public boolean LoadAccounts()
		{
			int i = 0;
			account acct;
			
			account_list.clear();
			
			for(i=0;i<100;i++)
			{
				acct = new account();
				
				acct.account_number = "ac" + i;
				account_list.add(acct);
				
			}
			
			return true;
		}
}
