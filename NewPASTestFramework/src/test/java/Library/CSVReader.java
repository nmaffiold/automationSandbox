package Library;

import Models.Data.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import Test.BaseTest;



public class CSVReader extends BaseTest {
//    public static void main(String... args) {
//        String projectPath = (System.getProperty("user.dir"));
//        List<TreatyData> values = readReassurerTreatyFromCSV(projectPath + "\\treatyData.csv");
//        for (TreatyData data : values) {
//            System.out.println("Values: " + data.toString());
//        }
//    }

    public List<DirectPaymentData> readDirectPaymentFromCSV(String fileName) {
        List<DirectPaymentData> directPaymentDataList = new ArrayList<>();
        Path pathToFile = Paths.get(fileName);
        // create an instance of BufferedReader
        try (BufferedReader br = Files.newBufferedReader(pathToFile, StandardCharsets.US_ASCII)) {
            // read the first line from the text file
            br.readLine();
            String line = br.readLine();
            // loop until all lines are read
            while (line != null) {
                String[] data = line.split(",");
                String searchType = data[0];
                String partyTypeId = data[1];
                String party = data[2];
                String scheme = data[3];
                String collectOn = data[4];
                String collectOnDate = data[5];
                String startDate = data[6];
                String expiryDate = data[7];
                String subType = data[8];
                String collectionFrequency = data[9];
                String currency = data[10];

                //Add Search Data for the Direct Payment Setup
                SearchPolicyData searchPolicyData = new SearchPolicyData()
                        .withSearchType(searchType)
                        .withPartyTypeID(partyTypeId)
                        .withScheme(scheme)
                        .withParty(party);

                //Add Data for the Direct Payment Setup
                DirectPaymentData directPaymentData = new DirectPaymentData()
                        .withCollectOn(collectOn)
                        .withCollectOnDate(collectOnDate)
                        .withStartDate(startDate)
                        .withExpiryDate(expiryDate)
                        .withSubType(subType)
                        .withCollectionFrequency(collectionFrequency)
                        .withCurrency(currency)
                        .withSearchPolicy(searchPolicyData);
                directPaymentDataList.add(directPaymentData);
                // read next line before looping
                // if end of file reached, line would be null
                line = br.readLine();
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        return directPaymentDataList;
    }

    public List<TreatyData> readReassurerTreatyFromCSV(String fileName) {
        List<TreatyData> treatyDataList = new ArrayList<>();

        Path pathToFile = Paths.get(fileName);
        // create an instance of BufferedReader
        try (BufferedReader br = Files.newBufferedReader(pathToFile, StandardCharsets.US_ASCII)) {
            // read the first line from the text file
            br.readLine();
            String line = br.readLine();
            // loop until all lines are read
            while (line != null) {
                String[] data = line.split(",");
                String rule = data[0];
                String treatyType = data[1];
                String treatyReferenceNumber = data[2];
                String treatyCommencementDate = data[3];
                String treatyBasis = data[4];
                String treatyContactLevel = data[5];
                String reinsurancePaymentFrequency = data[6];
                String searchType = data[7];
                String party = data[8];
                String partyTypeID = data[9];
                String customerType = data[10];
                String businessName = data[11];
                String companyIdentifier = data[12];
                String sanctionedEntity = data[13];
                String dateOfLastSanctionsScreening = data[14];
                String levelType = data[15];
                String treatyLimit= data[16];
                String underwritingLimit = data[17];
                String reassurerName = data[11];
                String reassurerSplit = data[18];
                String retentionLimitValue = data[19];
                String upperRetentionLimit = data[20];
                String lowerRetentionLimit = data[21];


                //Add Data for the Direct Payment Setup
                SearchPolicyData searchPolicyData = new SearchPolicyData()
                        .withSearchType(searchType)
                        .withParty(party)
                        .withPartyTypeID(partyTypeID)
                        ;

                CreateCustomerData createCustomerData = new CreateCustomerData()
                        .withCustomerType(customerType)
                        .withNameOfBusiness(businessName + " : " + generateRandomUniqueString())
                        .withCompanyIdentifier(companyIdentifier)
                        .withSanctionedEntity(sanctionedEntity)
                        .withDateOfLastSanctionsScreening(dateOfLastSanctionsScreening)
                        ;

                RuleData ruleData = new RuleData()
                        .withLevelType(levelType)
                        .withTreatyLimit(treatyLimit)
                        .withRetentionLimitValue(retentionLimitValue)
                        .withUpperRetentionLimit(upperRetentionLimit)
                        .withLowerRetentionLimit(lowerRetentionLimit)
                        ;

                TreatyData treatyData = new TreatyData()
                        .withTreatyType(treatyType)
                        .withTreatyReference(treatyReferenceNumber)
                        .withTreatyCommencementDate(treatyCommencementDate)
                        .withTreatyBasis(treatyBasis)
                        .withTreatyContactLevel(treatyContactLevel)
                        .withReinsurancePaymentFrequency(reinsurancePaymentFrequency)
                        .withCreateCustomerData(createCustomerData)
                        .withRuleData(ruleData)
                        .withSearchPolicyData(searchPolicyData)
                        .withReassurerSplit(reassurerSplit);


                if (rule.equalsIgnoreCase("true")) {
                    treatyData = treatyData.isRule();
                }
                treatyDataList.add(treatyData);

                line = br.readLine();
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        return treatyDataList;
    }
}