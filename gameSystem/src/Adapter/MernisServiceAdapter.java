package Adapter;

import java.rmi.RemoteException;
import java.sql.Date;

import Abstract.IdentityValidationService;
import Utils.ErrorResult;
import Utils.Result;
import Utils.SuccessResult;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;


public class MernisServiceAdapter implements IdentityValidationService {
	
	public MernisServiceAdapter() {
		System.out.println("");
		System.out.println("----Kullanýcý Doðrulama Sayfasý----");
		System.out.println("");
	}

	@Override
	public Result CheckIfRealPerson(String identityNumber, String firstName, String lastName, int birthYear) {
		
		KPSPublicSoapProxy kpsPublicSoapProxy = new KPSPublicSoapProxy();
		boolean result = true;
		
		try {
			result = kpsPublicSoapProxy.TCKimlikNoDogrula(
					Long.parseLong(identityNumber),
					firstName.toUpperCase(),
					lastName.toUpperCase(), 
					birthYear
					);
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		if(result) {
			return new SuccessResult();
		}else {
			return new ErrorResult(firstName.toUpperCase() + " " + lastName.toUpperCase() + " : Kimlik doðrulama baþarýsýz.");
		}
	}

}
