package MTMessages.MT103.Enums;

public enum BankOperationCodeEnum {

    /** Normal credit transfer
     * This message contains a credit transfer where there is no SWIFT Service Level involved
     */
    CRED,

    /**Test Message
     * This message contains a credit transfer for test purpose
     */
    CRTS,

    /**
     * SwiftPayThis message contains a credit transfer to be processed according to the SWIFTPay Service Level
     * */
    SPAY,

    /**Priority
     * This message contains a credit transfer to be processed according to the Priority Service Level
     */
    SPRI,

    /**Standard
     * This message contains a credit transfer to be processed according to the Standard Service Level
     */
    SSTD

}
