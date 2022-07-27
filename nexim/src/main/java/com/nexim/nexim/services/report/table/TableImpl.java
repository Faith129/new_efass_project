package com.nexim.nexim.services.report.table;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;



@Service
public class TableImpl implements TableService {

	@Value("${app.bankCode}")
	private String bankCode;
	@Value("${app.bankName}")
	private String bankName;
	@Value("${app.state}")
	private String state;
	@Value("${app.stateCode}")
	private String stateCode;
	@Value("${app.lgaName}")
	private String lgaName;
	@Value("${app.lgaCode}")
	private String lgaCode;

	public  ResponseEntity<?> AssetsTableData() {


		List<TabSheet> table = new ArrayList<TabSheet>();

		TabSheet data = new TabSheet();
		data.setSheetNumber("MDFIR100");
		data.setReturnCode("Form MDFIR100");
		data.setBankCode(bankCode);
		data.setBankName(bankName);
		data.setReturnName("Schedule of Memorandum Items");
		data.setLng(state);
		data.setVer(stateCode);
		table.add(data);

		TabSheet data1 = new TabSheet();
		data1.setSheetNumber("MDFIR101");
		data1.setReturnCode("Form MDFIR101");
		data1.setBankCode(bankCode);
		data1.setBankName(bankName);
		data1.setReturnName("Schedule of Loans and Advances Granted");
		data1.setLng(state);
		data1.setVer(stateCode);
		table.add(data1);

		TabSheet data2 = new TabSheet();
		data2.setSheetNumber("MDFIR122");
		data2.setReturnCode("Form MDFIR122");
		data2.setBankCode(bankCode);
		data2.setBankName(bankName);
		data2.setReturnName("Schedule of Money at Call held for Internal Banks");
		data2.setLng(state);
		data2.setVer(stateCode);
		table.add(data2);

		TabSheet data3 = new TabSheet();
		data3.setSheetNumber("MDFIR142");
		data3.setReturnCode("Form MDFIR142");
		data3.setBankCode(bankCode);
		data3.setBankName(bankName);
		data3.setReturnName("Schedule of Balances Due to Other Banks in Nigeria");
		data3.setLng(state);
		data3.setVer(stateCode);
		table.add(data3);

		TabSheet data4 = new TabSheet();
		data4.setSheetNumber("MDFIR161");
		data4.setReturnCode("Form MDFIR161");
		data4.setBankCode(bankCode);
		data4.setBankName(bankName);
		data4.setReturnName("Schedule of other balances held with CBN");
		data4.setLng(state);
		data4.setVer(stateCode);
		table.add(data4);

		TabSheet data5 = new TabSheet();
		data5.setSheetNumber("MDFIR172");
		data5.setReturnCode("Form MDFIR172");
		data5.setBankCode(bankCode);
		data5.setBankName(bankName);
		data5.setReturnName("Schedule of Balances Due to Other DFIs/Financial Institutions");
		data5.setLng(state);
		data5.setVer(stateCode);
		table.add(data5);

		TabSheet data6 = new TabSheet();
		data6.setSheetNumber("MDFIR182");
		data6.setReturnCode("Form MDFIR182");
		data6.setBankCode(bankCode);
		data6.setBankName(bankName);
		data6.setReturnName("Schedule of other Balances Due to Foreign Banks");
		data6.setLng(state);
		data6.setVer(stateCode);
		table.add(data6);

		TabSheet data7 = new TabSheet();
		data7.setSheetNumber("MDFIR191");
		data7.setReturnCode("Form MDFIR191");
		data7.setBankCode(bankCode);
		data7.setBankName(bankName);
		data7.setReturnName("Schedule of balances held with Banks in Nigeria");
		data7.setLng(state);
		data7.setVer(stateCode);
		table.add(data7);

		TabSheet data8 = new TabSheet();
		data8.setSheetNumber("MDFIR192");
		data8.setReturnCode("Form MDFIR192");
		data8.setBankCode(bankCode);
		data8.setBankName(bankName);
		data8.setReturnName("Schedule of Balances Due to Others");
		data8.setLng(state);
		data8.setVer(stateCode);
		table.add(data8);

		TabSheet data9 = new TabSheet();
		data9.setSheetNumber("MDFIR193");
		data9.setReturnCode("Form MDFIR193");
		data9.setBankCode(bankCode);
		data9.setBankName(bankName);
		data9.setReturnName("Schedule of Other Operating Income");
		data9.setLng(state);
		data9.setVer(stateCode);
		table.add(data9);

		TabSheet data10 = new TabSheet();
		data10.setSheetNumber("MDFIR201");
		data10.setReturnCode("Form MDFIR201");
		data10.setBankCode(bankCode);
		data10.setBankName(bankName);
		data10.setReturnName("Schedule of Balances held with other DFIs/ Financial Institutions");
		data10.setLng(state);
		data10.setVer(stateCode);
		table.add(data10);

		TabSheet data11 = new TabSheet();
		data11.setSheetNumber("MDFIR221");
		data11.setReturnCode("Form MDFIR221");
		data11.setBankCode(bankCode);
		data11.setBankName(bankName);
		data11.setReturnName("Schedule of Balances Held with Foreign Banks");
		data11.setLng(state);
		data11.setVer(stateCode);
		table.add(data11);

		TabSheet data12 = new TabSheet();
		data12.setSheetNumber("MDFIR223");
		data12.setReturnCode("Form MDFIR223");
		data12.setBankCode(bankCode);
		data12.setBankName(bankName);
		data12.setReturnName("Schedule of Quoted Equity Investments");
		data12.setLng(state);
		data12.setVer(stateCode);
		table.add(data12);

		TabSheet data13 = new TabSheet();
		data13.setSheetNumber("MDFIR250");
		data13.setReturnCode("Form MDFIR220");
		data13.setBankCode(bankCode);
		data13.setBankName(bankName);
		data13.setReturnName("Schedule of Interest Rate");
		data13.setLng(state);
		data13.setVer(stateCode);
		table.add(data13);

		TabSheet data14 = new TabSheet();
		data14.setSheetNumber("MDFIR271");
		data14.setReturnCode("Form MDFIR271");
		data14.setBankCode(bankCode);
		data14.setBankName(bankName);
		data14.setReturnName("Schedule of Money at Call held with Internal Banks");
		data14.setLng(state);
		data14.setVer(stateCode);
		table.add(data14);

		TabSheet data15 = new TabSheet();
		data15.setSheetNumber("MDFIR291");
		data15.setReturnCode("Form MDFIR291");
		data15.setBankCode(bankCode);
		data15.setBankName(bankName);
		data15.setReturnName("Schedule of Placements with Banks in Nigeria");
		data15.setLng(state);
		data15.setVer(stateCode);
		table.add(data15);

		TabSheet data16 = new TabSheet();
		data16.setSheetNumber("MDFIR291_1");
		data16.setReturnCode("Form MDFIR291_1");
		data16.setBankCode(bankCode);
		data16.setBankName(bankName);
		data16.setReturnName("Schedule of Derivative Financial Liabilities -Derivatives held for trading");
		data16.setLng(state);
		data16.setVer(stateCode);
		table.add(data16);

		TabSheet data17 = new TabSheet();
		data17.setSheetNumber("MDFIR291_2");
		data17.setReturnCode("Form MDFIR291_2");
		data17.setBankCode(bankCode);
		data17.setBankName(bankName);
		data17.setReturnName("Schedule of Derivative Financial Liabilities -Derivatives used as cash flow hedges.");
		data17.setLng(state);
		data17.setVer(stateCode);
		table.add(data17);

		TabSheet data18 = new TabSheet();
		data18.setSheetNumber("MDFIR291_3");
		data18.setReturnCode("Form MDFIR291_3");
		data18.setBankCode(bankCode);
		data18.setBankName(bankName);
		data18.setReturnName("Schedule of Derivative Financial Liabilities -Derivatives used as fair value hedge");
		data18.setLng(state);
		data18.setVer(stateCode);
		table.add(data18);

		TabSheet data19 = new TabSheet();
		data19.setSheetNumber("MDFIR300");
		data19.setReturnCode("Form MDFIR300");
		data19.setBankCode(bankCode);
		data19.setBankName(bankName);
		data19.setReturnName("Statement of Financial Position");
		data19.setLng(state);
		data19.setVer(stateCode);
		table.add(data19);

		TabSheet data20 = new TabSheet();
		data20.setSheetNumber("MDFIR302");
		data20.setReturnCode("Form MDFIR302");
		data20.setBankCode(bankCode);
		data20.setBankName(bankName);
		data20.setReturnName("Schedule of Other Liabilities");
		data20.setLng(state);
		data20.setVer(stateCode);
		table.add(data20);

		TabSheet data21 = new TabSheet();
		data21.setSheetNumber("MDFIR304");
		data21.setReturnCode("Form MDFIR304");
		data21.setBankCode(bankCode);
		data21.setBankName(bankName);
		data21.setReturnName("Breakdown of Other Liabilities");
		data21.setLng(state);
		data21.setVer(stateCode);
		table.add(data21);

		TabSheet data22 = new TabSheet();
		data22.setSheetNumber("MDFIR311");
		data22.setReturnCode("Form MDFIR311");
		data22.setBankCode(bankCode);
		data22.setBankName(bankName);
		data22.setReturnName("Schedule of Placement with DFIs/Financial Institutions");
		data22.setLng(state);
		data22.setVer(stateCode);
		table.add(data22);

		TabSheet data23 = new TabSheet();
		data23.setSheetNumber("MDFIR321");
		data23.setReturnCode("Form MDFIR321");
		data23.setBankCode(bankCode);
		data23.setBankName(bankName);
		data23.setReturnName("Schedule of Placement with Discount Houses");
		data23.setLng(state);
		data23.setVer(stateCode);
		table.add(data23);

		TabSheet data24 = new TabSheet();
		data24.setSheetNumber("MDFIR333");
		data24.setReturnCode("Form MDFIR333");
		data24.setBankCode(bankCode);
		data24.setBankName(bankName);
		data24.setReturnName("Schedule of Unquoted Equity Investments");
		data24.setLng(state);
		data24.setVer(stateCode);
		table.add(data24);

		TabSheet data25 = new TabSheet();
		data25.setSheetNumber("MDFIR363");
		data25.setReturnCode("Form MDFIR363");
		data25.setBankCode(bankCode);
		data25.setBankName(bankName);
		data25.setReturnName("Schedule of Net Investment in Subsidiaries");
		data25.setLng(state);
		data25.setVer(stateCode);
		table.add(data25);

		TabSheet data26 = new TabSheet();
		data26.setSheetNumber("MDFIR371.1");
		data26.setReturnCode("Form MDFIR371_1");
		data26.setBankCode(bankCode);
		data26.setBankName(bankName);
		data26.setReturnName("Schedule of Derivative Financial Assets -Derivatives held for trading  (by types)");
		data26.setLng(state);
		data26.setVer(stateCode);
		table.add(data26);

		TabSheet data27 = new TabSheet();
		data27.setSheetNumber("MDFIR371_2");
		data27.setReturnCode("Form MDFIR371_2");
		data27.setBankCode(bankCode);
		data27.setBankName(bankName);
		data27.setReturnName("Schedule of Derivative Financial Assets -Derivatives used as cash flow hedges (by types)");
		data27.setLng(state);
		data27.setVer(stateCode);
		table.add(data27);

		TabSheet data28 = new TabSheet();
		data28.setSheetNumber("MDFIR371_3");
		data28.setReturnCode("Form MDFIR371_3");
		data28.setBankCode(bankCode);
		data28.setBankName(bankName);
		data28.setReturnName("Schedule of Derivative Financial Assets -Derivatives used as fair value hedge (by types)");
		data28.setLng(state);
		data28.setVer(stateCode);
		table.add(data28);

		TabSheet data29 = new TabSheet();
		data29.setSheetNumber("MDFIR372");
		data29.setReturnCode("Form MDFIR372");
		data29.setBankCode(bankCode);
		data29.setBankName(bankName);
		data29.setReturnName("Schedule of Long Term Loans [Foreign]");
		data29.setLng(state);
		data29.setVer(stateCode);
		table.add(data29);

		TabSheet data30 = new TabSheet();
		data30.setSheetNumber("MDFIR382");
		data30.setReturnCode("Form MDFIR382");
		data30.setBankCode(bankCode);
		data30.setBankName(bankName);
		data30.setReturnName("Schedule of Other Long Term Loans");
		data30.setLng(state);
		data30.setVer(stateCode);
		table.add(data30);


		TabSheet data31 = new TabSheet();
		data31.setSheetNumber("MDFIR401_1");
		data31.setReturnCode("Form MDFIR401_1");
		data31.setBankCode(bankCode);
		data31.setBankName(bankName);
		data31.setReturnName("SCHEDULE OF PLEDGED TRADING ASSETS -Government Bonds: Federal");
		data31.setLng(state);
		data31.setVer(stateCode);
		table.add(data31);


		TabSheet data32 = new TabSheet();
		data32.setSheetNumber("MDFIR401_2");
		data32.setReturnCode("Form MDFIR401_2");
		data32.setBankCode(bankCode);
		data32.setBankName(bankName);
		data32.setReturnName("SCHEDULE OF PLEDGED TRADING ASSETS -Government Bonds: AMCON");
		data32.setLng(state);
		data32.setVer(stateCode);
		table.add(data32);


		TabSheet data33 = new TabSheet();
		data33.setSheetNumber("MDFIR401_3");
		data33.setReturnCode("Form MDFIR401_3");
		data33.setBankCode(bankCode);
		data33.setBankName(bankName);
		data33.setReturnName("SCHEDULE OF PLEDGED TRADING ASSETS -Government Bonds: State");
		data33.setLng(state);
		data33.setVer(stateCode);
		table.add(data33);

		TabSheet data34 = new TabSheet();
		data34.setSheetNumber("MDFIR401_4");
		data34.setReturnCode("Form MDFIR401_4");
		data34.setBankCode(bankCode);
		data34.setBankName(bankName);
		data34.setReturnName("SCHEDULE OF PLEDGED TRADING ASSETS -Government Bonds: Local");
		data34.setLng(state);
		data34.setVer(stateCode);
		table.add(data34);

		TabSheet data35 = new TabSheet();
		data35.setSheetNumber("MDFIR401_5");
		data35.setReturnCode("Form MDFIR401_5");
		data35.setBankCode(bankCode);
		data35.setBankName(bankName);
		data35.setReturnName("SCHEDULE OF PLEDGED TRADING ASSETS -Corporate Bonds");
		data35.setLng(state);
		data35.setVer(stateCode);
		table.add(data35);

		TabSheet data36 = new TabSheet();
		data36.setSheetNumber("MDFIR401_6");
		data36.setReturnCode("Form MDFIR401_6");
		data36.setBankCode(bankCode);
		data36.setBankName(bankName);
		data36.setReturnName("SCHEDULE OF PLEDGED TRADING ASSETS -Treasury Bills");
		data36.setLng(state);
		data36.setVer(stateCode);
		table.add(data36);


		TabSheet data37 = new TabSheet();
		data37.setSheetNumber("MDFIR401_7");
		data37.setReturnCode("Form MDFIR401_7");
		data37.setBankCode(bankCode);
		data37.setBankName(bankName);
		data37.setReturnName("SCHEDULE OF PLEDGED TRADING ASSETS -Treasury Certificates");
		data37.setLng(state);
		data37.setVer(stateCode);
		table.add(data37);


		TabSheet data38 = new TabSheet();
		data38.setSheetNumber("MDFIR401_8");
		data38.setReturnCode("Form MDFIR401_8");
		data38.setBankCode(bankCode);
		data38.setBankName(bankName);
		data38.setReturnName("SCHEDULE OF PLEDGED TRADING ASSETS -CBN Certificates");
		data38.setLng(state);
		data38.setVer(stateCode);
		table.add(data38);


		TabSheet data39 = new TabSheet();
		data39.setSheetNumber("MDFIR401_9");
		data39.setReturnCode("Form MDFIR401_9");
		data39.setBankCode(bankCode);
		data39.setBankName(bankName);
		data39.setReturnName("SCHEDULE OF PLEDGED TRADING ASSETS -Certificates of Deposits: Negotiable");
		data39.setLng(state);
		data39.setVer(stateCode);
		table.add(data39);


		TabSheet data40 = new TabSheet();
		data40.setSheetNumber("MDFIR401_10");
		data40.setReturnCode("Form MDFIR401_10");
		data40.setBankCode(bankCode);
		data40.setBankName(bankName);
		data40.setReturnName("SCHEDULE OF PLEDGED TRADING ASSETS -Certificates of Deposits: Non-Negotiable");
		data40.setLng(state);
		data40.setVer(stateCode);
		table.add(data40);


		TabSheet data41 = new TabSheet();
		data41.setSheetNumber("MDFIR401_11");
		data41.setReturnCode("Form MDFIR401_11");
		data41.setBankCode(bankCode);
		data41.setBankName(bankName);
		data41.setReturnName("SCHEDULE OF PLEDGED TRADING ASSETS -Bankers Acceptances");
		data41.setLng(state);
		data41.setVer(stateCode);
		table.add(data41);


		TabSheet data42 = new TabSheet();
		data42.setSheetNumber("MDFIR401_12");
		data42.setReturnCode("Form MDFIR401_12");
		data42.setBankCode(bankCode);
		data42.setBankName(bankName);
		data42.setReturnName("SCHEDULE OF PLEDGED TRADING ASSETS -Commercial Papers");
		data42.setLng(state);
		data42.setVer(stateCode);
		table.add(data42);

		TabSheet data43 = new TabSheet();
		data43.setSheetNumber("MDFIR401_13");
		data43.setReturnCode("Form MDFIR401_13");
		data43.setBankCode(bankCode);
		data43.setBankName(bankName);
		data43.setReturnName("SCHEDULE OF PLEDGED TRADING ASSETS -Promissory Notes");
		data43.setLng(state);
		data43.setVer(stateCode);
		table.add(data43);


		TabSheet data44 = new TabSheet();
		data44.setSheetNumber("MDFIR401_14");
		data44.setReturnCode("Form MDFIR401_14");
		data44.setBankCode(bankCode);
		data44.setBankName(bankName);
		data44.setReturnName("SCHEDULE OF PLEDGED TRADING ASSETS -Asset-backed securities");
		data44.setLng(state);
		data44.setVer(stateCode);
		table.add(data44);


		TabSheet data45 = new TabSheet();
		data45.setSheetNumber("MDFIR401_15");
		data45.setReturnCode("Form MDFIR401_15");
		data45.setBankCode(bankCode);
		data45.setBankName(bankName);
		data45.setReturnName("SCHEDULE OF PLEDGED TRADING ASSETS -Other Investments");
		data45.setLng(state);
		data45.setVer(stateCode);
		table.add(data45);

		TabSheet data46 = new TabSheet();
		data46.setSheetNumber("MDFIR412");
		data46.setReturnCode("Form MDFIR412");
		data46.setBankCode(bankCode);
		data46.setBankName(bankName);
		data46.setReturnName("Schedule of Counterpart funds [Aids and Grants]");
		data46.setLng(state);
		data46.setVer(stateCode);
		table.add(data46);

		TabSheet data47 = new TabSheet();
		data47.setSheetNumber("MDFIR422");
		data47.setReturnCode("Form MDFIR422");
		data47.setBankCode(bankCode);
		data47.setBankName(bankName);
		data47.setReturnName("Schedule of Counterpart funds [Program Loans]");
		data47.setLng(state);
		data47.setVer(stateCode);
		table.add(data47);

		TabSheet data48 = new TabSheet();
		data48.setSheetNumber("MDFIR423");
		data48.setReturnCode("Form MDFIR423");
		data48.setBankCode(bankCode);
		data48.setBankName(bankName);
		data48.setReturnName("Schedule of Other Assets");
		data48.setLng(state);
		data48.setVer(stateCode);
		table.add(data48);

		TabSheet data49 = new TabSheet();
		data49.setSheetNumber("MDFIR425");
		data49.setReturnCode("Form MDFIR425");
		data49.setBankCode(bankCode);
		data49.setBankName(bankName);
		data49.setReturnName("Schedule of Intangible Assets");
		data49.setLng(state);
		data49.setVer(stateCode);
		table.add(data49);

		TabSheet data50 = new TabSheet();
		data50.setSheetNumber("MDFIR432");
		data50.setReturnCode("Form MDFIR432");
		data50.setBankCode(bankCode);
		data50.setBankName(bankName);
		data50.setReturnName("Schedule of Counterpart funds [others]");
		data50.setLng(state);
		data50.setVer(stateCode);
		table.add(data50);


		TabSheet data51 = new TabSheet();
		data51.setSheetNumber("MDFIR450_1");
		data51.setReturnCode("Form MDFIR450_1");
		data51.setBankCode(bankCode);
		data51.setBankName(bankName);
		data51.setReturnName("SCHEDULE OF NON-PLEDGED TRADING ASSETS AS AT -Government Bonds: Federal");
		data51.setLng(state);
		data51.setVer(stateCode);
		table.add(data51);

		TabSheet data52 = new TabSheet();
		data52.setSheetNumber("MDFIR450_2");
		data52.setReturnCode("Form MDFIR450_2");
		data52.setBankCode(bankCode);
		data52.setBankName(bankName);
		data52.setReturnName("SCHEDULE OF NON-PLEDGED TRADING ASSETS AS AT - Government Bonds: AMCON");
		data52.setLng(state);
		data52.setVer(stateCode);
		table.add(data52);

		TabSheet data53 = new TabSheet();
		data53.setSheetNumber("MDFIR450_3");
		data53.setReturnCode("Form MDFIR450_3");
		data53.setBankCode(bankCode);
		data53.setBankName(bankName);
		data53.setReturnName("SCHEDULE OF NON-PLEDGED TRADING ASSETS AS AT -Government Bonds: State");
		data53.setLng(state);
		data53.setVer(stateCode);
		table.add(data53);


		TabSheet data54 = new TabSheet();
		data54.setSheetNumber("MDFIR450_4");
		data54.setReturnCode("Form MDFIR450_4");
		data54.setBankCode(bankCode);
		data54.setBankName(bankName);
		data54.setReturnName("SCHEDULE OF NON-PLEDGED TRADING ASSETS AS AT -Government Bonds: Local");
		data54.setLng(state);
		data54.setVer(stateCode);
		table.add(data54);


		TabSheet data55 = new TabSheet();
		data55.setSheetNumber("MDFIR450_5");
		data55.setReturnCode("Form MDFIR450_5");
		data55.setBankCode(bankCode);
		data55.setBankName(bankName);
		data55.setReturnName("SCHEDULE OF NON-PLEDGED TRADING ASSETS AS AT -Corporate Bonds");
		data55.setLng(state);
		data55.setVer(stateCode);
		table.add(data55);


		TabSheet data56 = new TabSheet();
		data56.setSheetNumber("MDFIR450_6");
		data56.setReturnCode("Form MDFIR450_6");
		data56.setBankCode(bankCode);
		data56.setBankName(bankName);
		data56.setReturnName("SCHEDULE OF NON-PLEDGED TRADING ASSETS AS AT -Treasury Bill");
		data56.setLng(state);
		data56.setVer(stateCode);
		table.add(data56);


		TabSheet data57 = new TabSheet();
		data57.setSheetNumber("MDFIR450_7");
		data57.setReturnCode("Form MDFIR450_7");
		data57.setBankCode(bankCode);
		data57.setBankName(bankName);
		data57.setReturnName("SCHEDULE OF NON-PLEDGED TRADING ASSETS AS AT -Treasury Certificates");
		data57.setLng(state);
		data57.setVer(stateCode);
		table.add(data57);


		TabSheet data58 = new TabSheet();
		data58.setSheetNumber("MDFIR450_8");
		data58.setReturnCode("Form MDFIR450_8");
		data58.setBankCode(bankCode);
		data58.setBankName(bankName);
		data58.setReturnName("SCHEDULE OF NON-PLEDGED TRADING ASSETS AS AT -CBN Certificates");
		data58.setLng(state);
		data58.setVer(stateCode);
		table.add(data58);


		TabSheet data59 = new TabSheet();
		data59.setSheetNumber("MDFIR450_9");
		data59.setReturnCode("Form MDFIR450_9");
		data59.setBankCode(bankCode);
		data59.setBankName(bankName);
		data59.setReturnName("SCHEDULE OF NON-PLEDGED TRADING ASSETS AS AT -Certificates of Deposits: Negotiable");
		data59.setLng(state);
		data59.setVer(stateCode);
		table.add(data59);

		TabSheet data60 = new TabSheet();
		data60.setSheetNumber("MDFIR450_10");
		data60.setReturnCode("Form MDFIR372");
		data60.setBankCode(bankCode);
		data60.setBankName(bankName);
		data60.setReturnName("SCHEDULE OF NON-PLEDGED TRADING ASSETS AS AT -Certificates of Deposits: Non-Negotiable");
		data60.setLng(state);
		data60.setVer(stateCode);
		table.add(data60);

		TabSheet data61 = new TabSheet();
		data61.setSheetNumber("MDFIR450_11");
		data61.setReturnCode("Form MDFIR450_11");
		data61.setBankCode(bankCode);
		data61.setBankName(bankName);
		data61.setReturnName("SCHEDULE OF NON-PLEDGED TRADING ASSETS AS AT -Bankers Acceptances");
		data61.setLng(state);
		data61.setVer(stateCode);
		table.add(data61);

		TabSheet data62 = new TabSheet();
		data62.setSheetNumber("MDFIR450_12");
		data62.setReturnCode("Form MDFIR450_12");
		data62.setBankCode(bankCode);
		data62.setBankName(bankName);
		data62.setReturnName("SCHEDULE OF NON-PLEDGED TRADING ASSETS AS AT -Commercial Papers");
		data62.setLng(state);
		data62.setVer(stateCode);
		table.add(data62);

		TabSheet data63 = new TabSheet();
		data63.setSheetNumber("MDFIR450.13");
		data63.setReturnCode("Form MDFIR450.13");
		data63.setBankCode(bankCode);
		data63.setBankName(bankName);
		data63.setReturnName("SCHEDULE OF NON-PLEDGED TRADING ASSETS AS AT -Promissory Notes");
		data63.setLng(state);
		data63.setVer(stateCode);
		table.add(data63);

		TabSheet data64 = new TabSheet();
		data64.setSheetNumber("MDFIR450_14");
		data64.setReturnCode("Form MDFIR450_14");
		data64.setBankCode(bankCode);
		data64.setBankName(bankName);
		data64.setReturnName("SCHEDULE OF NON-PLEDGED TRADING ASSETS AS AT -Asset-backed securities");
		data64.setLng(state);
		data64.setVer(stateCode);
		table.add(data64);

		TabSheet data65 = new TabSheet();
		data65.setSheetNumber("MDFIR450_15");
		data65.setReturnCode("Form MDFIR450_15");
		data65.setBankCode(bankCode);
		data65.setBankName(bankName);
		data65.setReturnName("SCHEDULE OF NON-PLEDGED TRADING ASSETS AS AT -Other Investments");
		data65.setLng(state);
		data65.setVer(stateCode);
		table.add(data65);

		TabSheet data66 = new TabSheet();
		data66.setSheetNumber("MDFIR453");
		data66.setReturnCode("Form MDFIR453");
		data66.setBankCode(bankCode);
		data66.setBankName(bankName);
		data66.setReturnName("Breakdown of Intangible Assets");
		data66.setLng(state);
		data66.setVer(stateCode);
		table.add(data66);

		TabSheet data67 = new TabSheet();
		data67.setSheetNumber("MDFIR455");
		data67.setReturnCode("Form MDFIR455");
		data67.setBankCode(bankCode);
		data67.setBankName(bankName);
		data67.setReturnName("Schedule of Non-Current Asset  / Disposal Group held for Sales");
		data67.setLng(state);
		data67.setVer(stateCode);
		table.add(data67);

		TabSheet data68 = new TabSheet();
		data68.setSheetNumber("MDFIR493");
		data68.setReturnCode("Form MDFIR493");
		data68.setBankCode(bankCode);
		data68.setBankName(bankName);
		data68.setReturnName("SCHEDULE OF PROPERTY, PLANT AND EQUIPMENTS");
		data68.setLng(state);
		data68.setVer(stateCode);
		table.add(data68);

		TabSheet data69= new TabSheet();
		data69.setSheetNumber("MDFIR533");
		data69.setReturnCode("Form MDFIR533");
		data69.setBankCode(bankCode);
		data69.setBankName(bankName);
		data69.setReturnName("Schedule of Other deposits");
		data69.setLng(state);
		data69.setVer(stateCode);
		table.add(data69);

		TabSheet data70 = new TabSheet();
		data70.setSheetNumber("MDFIR600");
		data70.setReturnCode("Form MDFIR600");
		data70.setBankCode(bankCode);
		data70.setBankName(bankName);
		data70.setReturnName("Schedule of Credit Approval & Disbursement By Sector Borrower & Interest Rate");
		data70.setLng(state);
		data70.setVer(stateCode);
		table.add(data70);

		TabSheet data71 = new TabSheet();
		data71.setSheetNumber("MDFIR601");
		data71.setReturnCode("Form MDFIR601");
		data71.setBankCode(bankCode);
		data71.setBankName(bankName);
		data71.setReturnName("Schedule of Undrawn Commitments");
		data71.setLng(state);
		data71.setVer(stateCode);
		table.add(data71);

		TabSheet data72 = new TabSheet();
		data72.setSheetNumber("MDFIR700");
		data72.setReturnCode("Form MDFIR700");
		data72.setBankCode(bankCode);
		data72.setBankName(bankName);
		data72.setReturnName("Schedule of Funds Sources and Interest costs");
		data72.setLng(state);
		data72.setVer(stateCode);
		table.add(data72);

		TabSheet data73 = new TabSheet();
		data73.setSheetNumber("MDFIR702");
		data73.setReturnCode("Form MDFIR702");
		data73.setBankCode(bankCode);
		data73.setBankName(bankName);
		data73.setReturnName("Schedule of Other Reserves");
		data73.setLng(state);
		data73.setVer(stateCode);
		table.add(data73);

		TabSheet data74 = new TabSheet();
		data74.setSheetNumber("MDFIR800");
		data74.setReturnCode("Form MDFIR800");
		data74.setBankCode(bankCode);
		data74.setBankName(bankName);
		data74.setReturnName("Schedule of Deposit Ownership");
		data74.setLng(state);
		data74.setVer(stateCode);
		table.add(data74);

		TabSheet data75 = new TabSheet();
		data75.setSheetNumber("MDFIR900");
		data75.setReturnCode("Form MDFIR900");
		data75.setBankCode(bankCode);
		data75.setBankName(bankName);
		data75.setReturnName("Schedule of Lending Above Statutory Limit");
		data75.setLng(state);
		data75.setVer(stateCode);
		table.add(data75);

		TabSheet data76 = new TabSheet();
		data76.setSheetNumber("MDFIR920");
		data76.setReturnCode("Form MDFIR920");
		data76.setBankCode(bankCode);
		data76.setBankName(bankName);
		data76.setReturnName("Returns on Dismissed / Terminated Staff");
		data76.setLng(state);
		data76.setVer(stateCode);
		table.add(data76);

		TabSheet data77 = new TabSheet();
		data77.setSheetNumber("MDFIR921");
		data77.setReturnCode("Form MDFIR921");
		data77.setBankCode(bankCode);
		data77.setBankName(bankName);
		data77.setReturnName("Returns on Fraud and Forgeries");
		data77.setLng(state);
		data77.setVer(stateCode);
		table.add(data77);

		TabSheet data78 = new TabSheet();
		data78.setSheetNumber("MDFIR1000");
		data78.setReturnCode("Form MDFIR1000");
		data78.setBankCode(bankCode);
		data78.setBankName(bankName);
		data78.setReturnName("Statement of Comprehensive Income");
		data78.setLng(state);
		data78.setVer(stateCode);
		table.add(data78);

		TabSheet data79 = new TabSheet();
		data79.setSheetNumber("MDFIR1200");
		data79.setReturnCode("Form MDFIR1200");
		data79.setBankCode(bankCode);
		data79.setBankName(bankName);
		data79.setReturnName("Schedule of Structure of deposits");
		data79.setLng(state);
		data79.setVer(stateCode);
		table.add(data79);

		TabSheet data80 = new TabSheet();
		data80.setSheetNumber("MDFIR1300");
		data80.setReturnCode("Form MDFIR1300");
		data80.setBankCode(bankCode);
		data80.setBankName(bankName);
		data80.setReturnName("Schedule of Non Performing Facilities");
		data80.setLng(state);
		data80.setVer(stateCode);
		table.add(data80);

		TabSheet data81 = new TabSheet();
		data81.setSheetNumber("MDFIR1301");
		data81.setReturnCode("Form MDFIR1301");
		data81.setBankCode(bankCode);
		data81.setBankName(bankName);
		data81.setReturnName("Schedule of Impaired Credit Facilities");
		data81.setLng(state);
		data81.setVer(stateCode);
		table.add(data81);

		TabSheet data82 = new TabSheet();
		data82.setSheetNumber("MDFIR1400");
		data82.setReturnCode("Form MDFIR1400");
		data82.setBankCode(bankCode);
		data82.setBankName(bankName);
		data82.setReturnName("Schedule of Non Performing Other Assets");
		data82.setLng(state);
		data82.setVer(stateCode);
		table.add(data82);

		TabSheet data83 = new TabSheet();
		data83.setSheetNumber("MDFIR1500");
		data83.setReturnCode("Form MDFIR1500");
		data83.setBankCode(bankCode);
		data83.setBankName(bankName);
		data83.setReturnName("Schedule of Contingent Liabilities");
		data83.setLng(state);
		data83.setVer(stateCode);
		table.add(data83);

		TabSheet data84 = new TabSheet();
		data84.setSheetNumber("MDFIR1600");
		data84.setReturnCode("Form MDFIR1600");
		data84.setBankCode(bankCode);
		data84.setBankName(bankName);
		data84.setReturnName("SCHEDULE OF LOANS/FACILITIES BY TYPE");
		data84.setLng(state);
		data84.setVer(stateCode);
		table.add(data84);

		TabSheet data85 = new TabSheet();
		data85.setSheetNumber("MDFIR1650");
		data85.setReturnCode("Form MDFIR1650");
		data85.setBankCode(bankCode);
		data85.setBankName(bankName);
		data85.setReturnName("Schedule of Credit to Director/Employees/S’holders and Related Interest");
		data85.setLng(state);
		data85.setVer(stateCode);
		table.add(data85);

		TabSheet data86 = new TabSheet();
		data86.setSheetNumber("MDFIR1700");
		data86.setReturnCode("Form MDFIR1700");
		data86.setBankCode(bankCode);
		data86.setBankName(bankName);
		data86.setReturnName("Schedule of top Users of Funds");
		data86.setLng(state);
		data86.setVer(stateCode);
		table.add(data86);

		TabSheet data87 = new TabSheet();
		data87.setSheetNumber("MSTDR1");
		data87.setReturnCode("Form MSTDR1");
		data87.setBankCode(bankCode);
		data87.setBankName(bankName);
		data87.setReturnName("SCHEDULE OF TOTAL LOANS AND ADVANCES GRANTED TO / OUTSTANDING BONDS AGAINST LOCAL GOVERNMENTS");
		data87.setLng(state);
		data87.setVer(stateCode);
		table.add(data87);

		TabSheet data88 = new TabSheet();
		data88.setSheetNumber("MSTDR2");
		data88.setReturnCode("Form MSTDR2");
		data88.setBankCode(bankCode);
		data88.setBankName(bankName);
		data88.setReturnName("SCHEDULE OF TOTAL LOANS AND ADVANCES GRANTED TO / OUTSTANDING BONDS AGAINST STATE GOVERNMENTS AND FCT");
		data88.setLng(state);
		data88.setVer(stateCode);
		table.add(data88);

		TabSheet data89 = new TabSheet();
		data89.setSheetNumber("MCFPR1");
		data89.setReturnCode("Form MCFPR1");
		data89.setBankCode(bankCode);
		data89.setBankName(bankName);
		data89.setReturnName("RETURNS ON CONSUMER COMPLAINTS");
		data89.setLng(state);
		data89.setVer(stateCode);
		table.add(data89);

		TableResponse res = new TableResponse();
		res.setResponseMessage("Success");
		res.setResponseCode(00);
		res.setData(table);
		return new ResponseEntity<>(res, HttpStatus.OK);


	}

}
