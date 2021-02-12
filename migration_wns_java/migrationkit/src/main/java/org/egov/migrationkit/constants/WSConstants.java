package org.egov.migrationkit.constants;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class WSConstants {
	
	public static final String URL_PARAMS_SEPARATER = "?";

	public static final String TENANT_ID_FIELD_FOR_SEARCH_URL = "tenantId=";

	public static final String SEPARATER = "&";

	public static final String SERVICE_FIELD_FOR_SEARCH_URL = "service=";

	public static final String CONSUMER_CODE_SEARCH_FIELD_NAME = "consumerCode=";
	
	public static final String BUSINESSSERVICE_FIELD_FOR_SEARCH_URL = "businessService=";
	
	public static final String WATER_TAX_SERVICE_CODE = "WS";
	
    public static final String WATER_BUSINESS_SERVICE="WS";
    
    public static final String SEWERAGE_BUSINESS_SERVICE="WS";
    
    public static final List<String> ONE_TIME_TAX_HEAD_MASTERS = Collections.unmodifiableList(
    		Arrays.asList("WS_OTHER_FEE", "WS_ROAD_CUTTING_CHARGE", "WS_FORM_FEE", "WS_SECURITY_DEPOSIT"));
    
    public static final String ONE_TIME_FEE_CONST = ".ONE_TIME_FEE";
	
	public static final HashMap<String, String> DIGIT_ROAD_CATEGORIES = new HashMap<>();
	public static final HashMap<String, String> TIME_PERIOD_MAP = new HashMap<>();
	public static final HashMap<String, String> TAX_HEAD_MAP = new HashMap<>();

    static {
    	
        DIGIT_ROAD_CATEGORIES.put("Premix Carpet", "PREMIXCARPET");
        DIGIT_ROAD_CATEGORIES.put("BM and Premix Road", "BMPREMIXROAD");
        DIGIT_ROAD_CATEGORIES.put("Berm Cutting (Katcha)", "BERMCUTTINGKATCHA");
        DIGIT_ROAD_CATEGORIES.put("Brick Paving", "BRICKPAVING");
        DIGIT_ROAD_CATEGORIES.put("CC Road", "CCROAD");
        DIGIT_ROAD_CATEGORIES.put("Interlocking Paver Block", "INTERLOCKINGPAVERBLOCK");
        DIGIT_ROAD_CATEGORIES.put("Under Scheme", "UNDERSCHEME");
        DIGIT_ROAD_CATEGORIES.put("Open Pipe", "OPENPIPE");
        
        TAX_HEAD_MAP.put("METERCHARGES", "WS_METER_TESTING_FEE");
        TAX_HEAD_MAP.put("PENALTY", "WS_TIME_PENALTY");
        TAX_HEAD_MAP.put("INTEREST", "WS_TIME_INTEREST");
        TAX_HEAD_MAP.put("WTAXCHARGES", "WS_CHARGE");
        TAX_HEAD_MAP.put("METERRENT", "WS_OTHER_FEE");
        TAX_HEAD_MAP.put("WTADJUSTMENT", "WS_OTHER_FEE");
        TAX_HEAD_MAP.put("DOORTODOORCOLLECTIONCHARGES", "WS_OTHER_FEE");
        TAX_HEAD_MAP.put("TITLETRANSFERFEE", "WS_OTHER_FEE");
        TAX_HEAD_MAP.put("ADDITIONALFEEFORTITLETRANSFER", "WS_OTHER_FEE");
        TAX_HEAD_MAP.put("WTAXSUPERVISION", "WS_OTHER_FEE");
        TAX_HEAD_MAP.put("WTADVANCE", "WS_ADVANCE_CARRYFORWARD");
        TAX_HEAD_MAP.put("WTAXSECURITY", "WS_SECURITY_DEPOSIT");
        TAX_HEAD_MAP.put("WTAXOTHERS", "WS_OTHER_FEE");
        TAX_HEAD_MAP.put("WTAXROADCUTTING", "WS_ROAD_CUTTING_CHARGE");
        TAX_HEAD_MAP.put("WTAXAPPLICATION", "WS_FORM_FEE");
        TAX_HEAD_MAP.put("CONNECTIONTYPECONVERSIONFEE", "WS_OTHER_FEE");
        
        //2021
        TIME_PERIOD_MAP.put("2021-03-31", "1617175799000");
        TIME_PERIOD_MAP.put("2021-04-01", "1585699200000");
        TIME_PERIOD_MAP.put("2021-06-30", "1617175799000");
        TIME_PERIOD_MAP.put("2021-07-01", "1585699200000");
        TIME_PERIOD_MAP.put("2021-09-30", "1617175799000");
        TIME_PERIOD_MAP.put("2021-10-01", "1585699200000");
        TIME_PERIOD_MAP.put("2021-12-31", "1617175799000");
        TIME_PERIOD_MAP.put("2021-01-01", "1617175799000");

        //2020
        TIME_PERIOD_MAP.put("2020-03-31", "1617175799000");
        TIME_PERIOD_MAP.put("2020-04-01", "1585699200000");
        TIME_PERIOD_MAP.put("2020-06-30", "1617175799000");
        TIME_PERIOD_MAP.put("2020-07-01", "1585699200000");
        TIME_PERIOD_MAP.put("2020-09-30", "1617175799000");
        TIME_PERIOD_MAP.put("2020-10-01", "1585699200000");
        TIME_PERIOD_MAP.put("2020-12-31", "1617175799000");
        TIME_PERIOD_MAP.put("2020-01-01", "1617175799000");
        //2019
        TIME_PERIOD_MAP.put("2019-03-31", "1617175799000");
        TIME_PERIOD_MAP.put("2019-04-01", "1585699200000");
        TIME_PERIOD_MAP.put("2019-06-30", "1617175799000");
        TIME_PERIOD_MAP.put("2019-07-01", "1585699200000");
        TIME_PERIOD_MAP.put("2019-09-30", "1617175799000");
        TIME_PERIOD_MAP.put("2019-10-01", "1585699200000");
        TIME_PERIOD_MAP.put("2019-12-31", "1617175799000");
        TIME_PERIOD_MAP.put("2019-01-01", "1617175799000");
        //2018
        TIME_PERIOD_MAP.put("2018-03-31", "1617175799000");
        TIME_PERIOD_MAP.put("2018-04-01", "1585699200000");
        TIME_PERIOD_MAP.put("2018-06-30", "1617175799000");
        TIME_PERIOD_MAP.put("2018-07-01", "1585699200000");
        TIME_PERIOD_MAP.put("2018-09-30", "1617175799000");
        TIME_PERIOD_MAP.put("2018-10-01", "1585699200000");
        TIME_PERIOD_MAP.put("2018-12-31", "1617175799000");
        TIME_PERIOD_MAP.put("2018-01-01", "1617175799000");
        //2017
        TIME_PERIOD_MAP.put("2017-03-31", "1617175799000");
        TIME_PERIOD_MAP.put("2017-04-01", "1585699200000");
        TIME_PERIOD_MAP.put("2017-06-30", "1617175799000");
        TIME_PERIOD_MAP.put("2017-07-01", "1585699200000");
        TIME_PERIOD_MAP.put("2017-09-30", "1617175799000");
        TIME_PERIOD_MAP.put("2017-10-01", "1585699200000");
        TIME_PERIOD_MAP.put("2017-12-31", "1617175799000");
        TIME_PERIOD_MAP.put("2017-01-01", "1617175799000");
        //2016
        TIME_PERIOD_MAP.put("2016-03-31", "1617175799000");
        TIME_PERIOD_MAP.put("2016-04-01", "1585699200000");
        TIME_PERIOD_MAP.put("2016-06-30", "1617175799000");
        TIME_PERIOD_MAP.put("2016-07-01", "1585699200000");
        TIME_PERIOD_MAP.put("2016-09-30", "1617175799000");
        TIME_PERIOD_MAP.put("2016-10-01", "1585699200000");
        TIME_PERIOD_MAP.put("2016-12-31", "1617175799000");
        TIME_PERIOD_MAP.put("2016-01-01", "1617175799000");
        //2015
        TIME_PERIOD_MAP.put("2015-03-31", "1617175799000");
        TIME_PERIOD_MAP.put("2015-04-01", "1585699200000");
        TIME_PERIOD_MAP.put("2015-06-30", "1617175799000");
        TIME_PERIOD_MAP.put("2015-07-01", "1585699200000");
        TIME_PERIOD_MAP.put("2015-09-30", "1617175799000");
        TIME_PERIOD_MAP.put("2015-10-01", "1585699200000");
        TIME_PERIOD_MAP.put("2015-12-31", "1617175799000");
        TIME_PERIOD_MAP.put("2015-01-01", "1617175799000");
        //2014
        TIME_PERIOD_MAP.put("2014-03-31", "1617175799000");
        TIME_PERIOD_MAP.put("2014-04-01", "1585699200000");
        TIME_PERIOD_MAP.put("2014-06-30", "1617175799000");
        TIME_PERIOD_MAP.put("2014-07-01", "1585699200000");
        TIME_PERIOD_MAP.put("2014-09-30", "1617175799000");
        TIME_PERIOD_MAP.put("2014-10-01", "1585699200000");
        TIME_PERIOD_MAP.put("2014-12-31", "1617175799000");
        TIME_PERIOD_MAP.put("2014-01-01", "1617175799000");
        //2013
        TIME_PERIOD_MAP.put("2013-03-31", "1617175799000");
        TIME_PERIOD_MAP.put("2013-04-01", "1585699200000");
        TIME_PERIOD_MAP.put("2013-06-30", "1617175799000");
        TIME_PERIOD_MAP.put("2013-07-01", "1585699200000");
        TIME_PERIOD_MAP.put("2013-09-30", "1617175799000");
        TIME_PERIOD_MAP.put("2013-10-01", "1585699200000");
        TIME_PERIOD_MAP.put("2013-12-31", "1617175799000");
        TIME_PERIOD_MAP.put("2013-01-01", "1617175799000");
       
    }
    
    
}
