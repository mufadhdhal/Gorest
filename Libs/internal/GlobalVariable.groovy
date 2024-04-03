package internal

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.main.TestCaseMain


/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */
public class GlobalVariable {
     
    /**
     * <p></p>
     */
    public static Object baseUrl
     
    /**
     * <p></p>
     */
    public static Object email
     
    /**
     * <p></p>
     */
    public static Object name
     
    /**
     * <p></p>
     */
    public static Object id
     
    /**
     * <p></p>
     */
    public static Object emailUp
     

    static {
        try {
            def selectedVariables = TestCaseMain.getGlobalVariables("default")
			selectedVariables += TestCaseMain.getGlobalVariables(RunConfiguration.getExecutionProfile())
            selectedVariables += TestCaseMain.getParsedValues(RunConfiguration.getOverridingParameters(), selectedVariables)
    
            baseUrl = selectedVariables['baseUrl']
            email = selectedVariables['email']
            name = selectedVariables['name']
            id = selectedVariables['id']
            emailUp = selectedVariables['emailUp']
            
        } catch (Exception e) {
            TestCaseMain.logGlobalVariableError(e)
        }
    }
}
