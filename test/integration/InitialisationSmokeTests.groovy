class InitialisationSmokeTests {

    def resourceService
    
    /**
     * We are testing that the resources plugin operates correctly in an integration testing environment. 
     * That is, it does not cause issues for users when installed and they are running integration tests.
     * 
     * @see TestOnlyResources
     */
    void testInitialisedOk() {
        //@todo this temporarily removed until Grails fixes the problems with servletContext resource loading/another workaround found
        //assert resourceService.getModule("jquery") != null
    }

}