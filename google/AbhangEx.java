package google;

class AbhangEx{
	public int getValidRegistraionsCount(String registrationNumbers[]){
		int validRegNoCount = 0;
		String deptCode[] = {"BIT", "BCS", "BCH", "BME"};

		for(int i = 0; i < registrationNumbers.length; i++){
			char regNo[] = registrationNumbers[i].toCharArray();
			//System.out.println(regNo);
			if(regNo.length == 10){
				boolean isCheckingValid = true;
				
				for(int j = 0; j < 4; j++){
					if(!Character.isDigit(regNo[j])){
						isCheckingValid = false;
					}
				}
				
				if(isCheckingValid){
				//System.out.println(regNo);
					String tempDeptCode = String.valueOf(regNo, 4, 3);
					System.out.println(tempDeptCode);
                    // System.out.println(tempDeptCode.length());
                    // System.out.println(regNo);
					for(int j = 0; j < deptCode.length; j++){
                        System.out.println(deptCode[j]);
						if(!(tempDeptCode.equalsIgnoreCase(deptCode[j]))){
							// System.out.println(!(tempDeptCode.equalsIgnoreCase(deptCode[j])));
							// isCheckingValid = false;
                            System.out.println("Arrived");
						}
					}
				}
				
				if(isCheckingValid){
				System.out.println(regNo);
					for(int j = 7;  j < 10; j++){
						if(!Character.isDigit(regNo[j])){
							isCheckingValid = false;
						}
					}
				}
				
				if(isCheckingValid){
					validRegNoCount += 1;
				}
			}
		}
		
		return validRegNoCount;
	}
	
	public static void main(String args[]){
		String arr[] = {"2023bit508", "2022bcs024", "2024bch001", "2020bme501"};
		AbhangEx obj = new AbhangEx();
		int count = obj.getValidRegistraionsCount(arr);
		System.out.println(count);
	}
}
