<?xml version="1.0" encoding="UTF-8" ?>
<xsl:stylesheet version="2.0"
                xmlns:xp20="http://www.oracle.com/XSL/Transform/java/oracle.tip.pc.services.functions.Xpath20"
                xmlns:oraxsl="http://www.oracle.com/XSL/Transform/java"
                xmlns:mhdr="http://www.oracle.com/XSL/Transform/java/oracle.tip.mediator.service.common.functions.MediatorExtnFunction"
                xmlns:oraext="http://www.oracle.com/XSL/Transform/java/oracle.tip.pc.services.functions.ExtFunc"
                xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
                xmlns:oracle-xsl-mapper="http://www.oracle.com/xsl/mapper/schemas"
                xmlns:dvm="http://www.oracle.com/XSL/Transform/java/oracle.tip.dvm.LookupValue"
                xmlns:ns1="http://xmlns.oracle.com/Oil_N_Gas_ISA_Workspace/HSFDataExport/HSFDataExportBPELProcess"
                xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:ns0="http://pradipta.com/hsf/customwebservices/"
                xmlns:xref="http://www.oracle.com/XSL/Transform/java/oracle.tip.xref.xpath.XRefXPathFunctions"
                xmlns:tns="http://TargetNamespace.com/WritefileReference" xmlns:xsd="http://www.w3.org/2001/XMLSchema"
                xmlns:socket="http://www.oracle.com/XSL/Transform/java/oracle.tip.adapter.socket.ProtocolTranslator"
                exclude-result-prefixes="xsi oracle-xsl-mapper xsl xsd ns1 ns0 tns xp20 oraxsl mhdr oraext dvm xref socket"
                xmlns:plnk="http://docs.oasis-open.org/wsbpel/2.0/plnktype"
                xmlns:soap12="http://schemas.xmlsoap.org/wsdl/soap12/"
                xmlns:soap="http://schemas.xmlsoap.org/wsdl/soap/" xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/"
                xmlns:mime="http://schemas.xmlsoap.org/wsdl/mime/"
                xmlns:ns2="http://xmlns.oracle.com/pcbpel/adapter/file/Oil_N_Gas_ISA_Workspace/HSFDataExport/WritefileReference"
                xmlns:jca="http://xmlns.oracle.com/pcbpel/wsdl/jca/"
                xmlns:plt="http://schemas.xmlsoap.org/ws/2003/05/partner-link/">
  <oracle-xsl-mapper:schema>
    <!--SPECIFICATION OF MAP SOURCES AND TARGETS, DO NOT MODIFY.-->
    <oracle-xsl-mapper:mapSources>
      <oracle-xsl-mapper:source type="WSDL">
        <oracle-xsl-mapper:schema location="../WSDLs/HSFWebServiceSoap11.wsdl"/>
        <oracle-xsl-mapper:rootElement name="getEntityDataCellsResponse"
                                       namespace="http://pradipta.com/hsf/customwebservices/"/>
      </oracle-xsl-mapper:source>
      <oracle-xsl-mapper:source type="WSDL">
        <oracle-xsl-mapper:schema location="../WSDLs/HSFDataExportBPELProcess.wsdl"/>
        <oracle-xsl-mapper:rootElement name="process"
                                       namespace="http://xmlns.oracle.com/Oil_N_Gas_ISA_Workspace/HSFDataExport/HSFDataExportBPELProcess"/>
        <oracle-xsl-mapper:param name="inputVariable.payload"/>
      </oracle-xsl-mapper:source>
    </oracle-xsl-mapper:mapSources>
    <oracle-xsl-mapper:mapTargets>
      <oracle-xsl-mapper:target type="WSDL">
        <oracle-xsl-mapper:schema location="../WSDLs/WritefileReference.wsdl"/>
        <oracle-xsl-mapper:rootElement name="ListofPBCSAccountsData"
                                       namespace="http://TargetNamespace.com/WritefileReference"/>
      </oracle-xsl-mapper:target>
    </oracle-xsl-mapper:mapTargets>
    <!--GENERATED BY ORACLE XSL MAPPER 12.1.3.0.0(XSLT Build 140529.0700.0211) AT [THU JUL 07 19:29:15 IST 2016].-->
  </oracle-xsl-mapper:schema>
  <!--User Editing allowed BELOW this line - DO NOT DELETE THIS LINE-->
  <xsl:param name="inputVariable.payload"/>
  <!--xsl:variable name="no_of_months" select="12"/-->
  <xsl:template match="/">
    <tns:ListofPBCSAccountsData>
      <xsl:for-each select="/ns0:getEntityDataCellsResponse/ns0:DataCell">
        <xsl:variable name="accNum" select="ns0:AccountNumber"/>
        <xsl:variable name="year" select="ns0:time"/>
        <xsl:variable name="value" select="ns0:value"/>
        <tns:PBCSAccountData>
          <tns:AccountName>
            <xsl:value-of select="concat ('&quot;', $inputVariable.payload/ns1:process/ns1:AccountDetails[ns1:AccountNumber/text() = $accNum]/ns1:AccountName, '&quot;' )"/>
          </tns:AccountName>
          <tns:Entity>
            <xsl:value-of select="concat ('&quot;', $inputVariable.payload/ns1:process/ns1:AccountDetails[ns1:AccountNumber/text() = $accNum]/ns1:Entity, '&quot;')"/>
          </tns:Entity>
          <tns:Month>
            <xsl:value-of select="concat ('&quot;', substring ($year, 1, 3 ), '&quot;')"/>
          </tns:Month>
          <!--<xsl:choose>
              <xsl:when test="position() = 1">
                <tns:Month>"Jan"</tns:Month>
              </xsl:when>
              <xsl:when test="position()=2">
                <tns:Month>"Feb"</tns:Month>
              </xsl:when>
              <xsl:when test="position()=3">
                <tns:Month>"Mar"</tns:Month>
              </xsl:when>
              <xsl:when test="position()=4">
                <tns:Month>"Apr"</tns:Month>
              </xsl:when>
              <xsl:when test="position()=5">
                <tns:Month>"May"</tns:Month>
              </xsl:when>
              <xsl:when test="position()=6">
                <tns:Month>"Jun"</tns:Month>
              </xsl:when>
              <xsl:when test="position()=7">
                <tns:Month>"Jul"</tns:Month>
              </xsl:when>
              <xsl:when test="position()=8">
                <tns:Month>"Aug"</tns:Month>
              </xsl:when>
              <xsl:when test="position()=9">
                <tns:Month>"Sep"</tns:Month>
              </xsl:when>
              <xsl:when test="position()=10">
                <tns:Month>"Oct"</tns:Month>
              </xsl:when>
              <xsl:when test="position()=11">
                <tns:Month>"Nov"</tns:Month>
              </xsl:when>
              <xsl:when test="position()=12">
                <tns:Month>"Dec"</tns:Month>
              </xsl:when>
              <xsl:otherwise>
                <tns:Month>"OutofBounds"</tns:Month>
              </xsl:otherwise>
            </xsl:choose-->
          <tns:FinYear>
            <xsl:value-of select="concat ('&quot;', 'FY', substring ($year, 4) ,'&quot;')"/>
          </tns:FinYear>
          <tns:Budget>"Budget"</tns:Budget>
          <tns:Version>"Draft"</tns:Version>
          <tns:Value>
            <xsl:choose>
              <xsl:when test="(number($value) div 1000000) > 0">
                <!--<xsl:value-of select='string(format-number((number($value)), "#.00" ))'/>-->
                <!--<xsl:value-of select='string(format-number((number($value) div 1000000), "#.00" ))'/>-->
                <xsl:value-of select='(number($value) div 1000000)'/>
              </xsl:when>
              <xsl:otherwise>
                <xsl:text>0.00</xsl:text>
              </xsl:otherwise>
            </xsl:choose>
          </tns:Value>
        </tns:PBCSAccountData>
      </xsl:for-each>
    </tns:ListofPBCSAccountsData>
  </xsl:template>
</xsl:stylesheet>