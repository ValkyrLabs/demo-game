
import React, { useState } from 'react';

import { Col, Container, Nav, NavDropdown, Row, Tab, Tabs } from "react-bootstrap";
import CoolButton from "../../../../components/CoolButton";
import TimeSeriesChart from "../../../../components/Charts/TimeSeriesChart";
import SplitPaneView from "../../../../components/SplitPane/SplitPaneView";
import FloatingToolbar from "../../../../components/FloatingToolbar";


import  AclEntryChart  from '../chart/AclEntryChart';
import  AclEntryForm  from '../form/AclEntryForm';
import  AclEntryTable from '../table/AclEntryTable';


import  AddressChart  from '../chart/AddressChart';
import  AddressForm  from '../form/AddressForm';
import  AddressTable from '../table/AddressTable';


import  ApplicationChart  from '../chart/ApplicationChart';
import  ApplicationForm  from '../form/ApplicationForm';
import  ApplicationTable from '../table/ApplicationTable';


import  BackupConfigChart  from '../chart/BackupConfigChart';
import  BackupConfigForm  from '../form/BackupConfigForm';
import  BackupConfigTable from '../table/BackupConfigTable';


import  BlankRangeChart  from '../chart/BlankRangeChart';
import  BlankRangeForm  from '../form/BlankRangeForm';
import  BlankRangeTable from '../table/BlankRangeTable';


import  BorderChart  from '../chart/BorderChart';
import  BorderForm  from '../form/BorderForm';
import  BorderTable from '../table/BorderTable';


import  BuildChart  from '../chart/BuildChart';
import  BuildForm  from '../form/BuildForm';
import  BuildTable from '../table/BuildTable';


import  BuildOutputChart  from '../chart/BuildOutputChart';
import  BuildOutputForm  from '../form/BuildOutputForm';
import  BuildOutputTable from '../table/BuildOutputTable';


import  CampaignChart  from '../chart/CampaignChart';
import  CampaignForm  from '../form/CampaignForm';
import  CampaignTable from '../table/CampaignTable';


import  CellChart  from '../chart/CellChart';
import  CellForm  from '../form/CellForm';
import  CellTable from '../table/CellTable';


import  ChartChart  from '../chart/ChartChart';
import  ChartForm  from '../form/ChartForm';
import  ChartTable from '../table/ChartTable';


import  ChartSeriesChart  from '../chart/ChartSeriesChart';
import  ChartSeriesForm  from '../form/ChartSeriesForm';
import  ChartSeriesTable from '../table/ChartSeriesTable';


import  ChatMessageChart  from '../chart/ChatMessageChart';
import  ChatMessageForm  from '../form/ChatMessageForm';
import  ChatMessageTable from '../table/ChatMessageTable';


import  ChatResponseChart  from '../chart/ChatResponseChart';
import  ChatResponseForm  from '../form/ChatResponseForm';
import  ChatResponseTable from '../table/ChatResponseTable';


import  ContentDataChart  from '../chart/ContentDataChart';
import  ContentDataForm  from '../form/ContentDataForm';
import  ContentDataTable from '../table/ContentDataTable';


import  ContentMediaLinkChart  from '../chart/ContentMediaLinkChart';
import  ContentMediaLinkForm  from '../form/ContentMediaLinkForm';
import  ContentMediaLinkTable from '../table/ContentMediaLinkTable';


import  CustomerChart  from '../chart/CustomerChart';
import  CustomerForm  from '../form/CustomerForm';
import  CustomerTable from '../table/CustomerTable';


import  EventLogChart  from '../chart/EventLogChart';
import  EventLogForm  from '../form/EventLogForm';
import  EventLogTable from '../table/EventLogTable';


import  ExecModuleChart  from '../chart/ExecModuleChart';
import  ExecModuleForm  from '../form/ExecModuleForm';
import  ExecModuleTable from '../table/ExecModuleTable';


import  FormatChart  from '../chart/FormatChart';
import  FormatForm  from '../form/FormatForm';
import  FormatTable from '../table/FormatTable';


import  FormulaChart  from '../chart/FormulaChart';
import  FormulaForm  from '../form/FormulaForm';
import  FormulaTable from '../table/FormulaTable';


import  GameChart  from '../chart/GameChart';
import  GameForm  from '../form/GameForm';
import  GameTable from '../table/GameTable';


import  GoalChart  from '../chart/GoalChart';
import  GoalForm  from '../form/GoalForm';
import  GoalTable from '../table/GoalTable';


import  GoalDependencyChart  from '../chart/GoalDependencyChart';
import  GoalDependencyForm  from '../form/GoalDependencyForm';
import  GoalDependencyTable from '../table/GoalDependencyTable';


import  IntegrationAccountChart  from '../chart/IntegrationAccountChart';
import  IntegrationAccountForm  from '../form/IntegrationAccountForm';
import  IntegrationAccountTable from '../table/IntegrationAccountTable';


import  InvoiceChart  from '../chart/InvoiceChart';
import  InvoiceForm  from '../form/InvoiceForm';
import  InvoiceTable from '../table/InvoiceTable';


import  KeyMetricChart  from '../chart/KeyMetricChart';
import  KeyMetricForm  from '../form/KeyMetricForm';
import  KeyMetricTable from '../table/KeyMetricTable';


import  LlmDetailsChart  from '../chart/LlmDetailsChart';
import  LlmDetailsForm  from '../form/LlmDetailsForm';
import  LlmDetailsTable from '../table/LlmDetailsTable';


import  LoginChart  from '../chart/LoginChart';
import  LoginForm  from '../form/LoginForm';
import  LoginTable from '../table/LoginTable';


import  LogoutChart  from '../chart/LogoutChart';
import  LogoutForm  from '../form/LogoutForm';
import  LogoutTable from '../table/LogoutTable';


import  MediaObjectChart  from '../chart/MediaObjectChart';
import  MediaObjectForm  from '../form/MediaObjectForm';
import  MediaObjectTable from '../table/MediaObjectTable';


import  MergeRangeChart  from '../chart/MergeRangeChart';
import  MergeRangeForm  from '../form/MergeRangeForm';
import  MergeRangeTable from '../table/MergeRangeTable';


import  NamedRangeChart  from '../chart/NamedRangeChart';
import  NamedRangeForm  from '../form/NamedRangeForm';
import  NamedRangeTable from '../table/NamedRangeTable';


import  NoteChart  from '../chart/NoteChart';
import  NoteForm  from '../form/NoteForm';
import  NoteTable from '../table/NoteTable';


import  OasComponentsChart  from '../chart/OasComponentsChart';
import  OasComponentsForm  from '../form/OasComponentsForm';
import  OasComponentsTable from '../table/OasComponentsTable';


import  OasEnumChart  from '../chart/OasEnumChart';
import  OasEnumForm  from '../form/OasEnumForm';
import  OasEnumTable from '../table/OasEnumTable';


import  OasInfoChart  from '../chart/OasInfoChart';
import  OasInfoForm  from '../form/OasInfoForm';
import  OasInfoTable from '../table/OasInfoTable';


import  OasObjectSchemaChart  from '../chart/OasObjectSchemaChart';
import  OasObjectSchemaForm  from '../form/OasObjectSchemaForm';
import  OasObjectSchemaTable from '../table/OasObjectSchemaTable';


import  OasOpenAPISpecChart  from '../chart/OasOpenAPISpecChart';
import  OasOpenAPISpecForm  from '../form/OasOpenAPISpecForm';
import  OasOpenAPISpecTable from '../table/OasOpenAPISpecTable';


import  OasOperationChart  from '../chart/OasOperationChart';
import  OasOperationForm  from '../form/OasOperationForm';
import  OasOperationTable from '../table/OasOperationTable';


import  OasParameterChart  from '../chart/OasParameterChart';
import  OasParameterForm  from '../form/OasParameterForm';
import  OasParameterTable from '../table/OasParameterTable';


import  OasPathChart  from '../chart/OasPathChart';
import  OasPathForm  from '../form/OasPathForm';
import  OasPathTable from '../table/OasPathTable';


import  OasRequiredChart  from '../chart/OasRequiredChart';
import  OasRequiredForm  from '../form/OasRequiredForm';
import  OasRequiredTable from '../table/OasRequiredTable';


import  OasResponseChart  from '../chart/OasResponseChart';
import  OasResponseForm  from '../form/OasResponseForm';
import  OasResponseTable from '../table/OasResponseTable';


import  OasSecuritySchemeChart  from '../chart/OasSecuritySchemeChart';
import  OasSecuritySchemeForm  from '../form/OasSecuritySchemeForm';
import  OasSecuritySchemeTable from '../table/OasSecuritySchemeTable';


import  OasServerChart  from '../chart/OasServerChart';
import  OasServerForm  from '../form/OasServerForm';
import  OasServerTable from '../table/OasServerTable';


import  OpportunityChart  from '../chart/OpportunityChart';
import  OpportunityForm  from '../form/OpportunityForm';
import  OpportunityTable from '../table/OpportunityTable';


import  OrganizationChart  from '../chart/OrganizationChart';
import  OrganizationForm  from '../form/OrganizationForm';
import  OrganizationTable from '../table/OrganizationTable';


import  PivotTableChart  from '../chart/PivotTableChart';
import  PivotTableForm  from '../form/PivotTableForm';
import  PivotTableTable from '../table/PivotTableTable';


import  PrincipalChart  from '../chart/PrincipalChart';
import  PrincipalForm  from '../form/PrincipalForm';
import  PrincipalTable from '../table/PrincipalTable';


import  ProductChart  from '../chart/ProductChart';
import  ProductForm  from '../form/ProductForm';
import  ProductTable from '../table/ProductTable';


import  PtgChart  from '../chart/PtgChart';
import  PtgForm  from '../form/PtgForm';
import  PtgTable from '../table/PtgTable';


import  PtgRefChart  from '../chart/PtgRefChart';
import  PtgRefForm  from '../form/PtgRefForm';
import  PtgRefTable from '../table/PtgRefTable';


import  RatingChart  from '../chart/RatingChart';
import  RatingForm  from '../form/RatingForm';
import  RatingTable from '../table/RatingTable';


import  RoleChart  from '../chart/RoleChart';
import  RoleForm  from '../form/RoleForm';
import  RoleTable from '../table/RoleTable';


import  SalesActivityChart  from '../chart/SalesActivityChart';
import  SalesActivityForm  from '../form/SalesActivityForm';
import  SalesActivityTable from '../table/SalesActivityTable';


import  SalesOrderChart  from '../chart/SalesOrderChart';
import  SalesOrderForm  from '../form/SalesOrderForm';
import  SalesOrderTable from '../table/SalesOrderTable';


import  SalesPipelineChart  from '../chart/SalesPipelineChart';
import  SalesPipelineForm  from '../form/SalesPipelineForm';
import  SalesPipelineTable from '../table/SalesPipelineTable';


import  SecureKeyChart  from '../chart/SecureKeyChart';
import  SecureKeyForm  from '../form/SecureKeyForm';
import  SecureKeyTable from '../table/SecureKeyTable';


import  SheetChart  from '../chart/SheetChart';
import  SheetForm  from '../form/SheetForm';
import  SheetTable from '../table/SheetTable';


import  SheetColumnChart  from '../chart/SheetColumnChart';
import  SheetColumnForm  from '../form/SheetColumnForm';
import  SheetColumnTable from '../table/SheetColumnTable';


import  SheetRowChart  from '../chart/SheetRowChart';
import  SheetRowForm  from '../form/SheetRowForm';
import  SheetRowTable from '../table/SheetRowTable';


import  SolutionChart  from '../chart/SolutionChart';
import  SolutionForm  from '../form/SolutionForm';
import  SolutionTable from '../table/SolutionTable';


import  StrategicPriorityChart  from '../chart/StrategicPriorityChart';
import  StrategicPriorityForm  from '../form/StrategicPriorityForm';
import  StrategicPriorityTable from '../table/StrategicPriorityTable';


import  TaskChart  from '../chart/TaskChart';
import  TaskForm  from '../form/TaskForm';
import  TaskTable from '../table/TaskTable';


import  ThorUXComponentChart  from '../chart/ThorUXComponentChart';
import  ThorUXComponentForm  from '../form/ThorUXComponentForm';
import  ThorUXComponentTable from '../table/ThorUXComponentTable';


import  ThorUXMetaChart  from '../chart/ThorUXMetaChart';
import  ThorUXMetaForm  from '../form/ThorUXMetaForm';
import  ThorUXMetaTable from '../table/ThorUXMetaTable';


import  WeaponChart  from '../chart/WeaponChart';
import  WeaponForm  from '../form/WeaponForm';
import  WeaponTable from '../table/WeaponTable';


import  WorkbookChart  from '../chart/WorkbookChart';
import  WorkbookForm  from '../form/WorkbookForm';
import  WorkbookTable from '../table/WorkbookTable';


import  WorkflowChart  from '../chart/WorkflowChart';
import  WorkflowForm  from '../form/WorkflowForm';
import  WorkflowTable from '../table/WorkflowTable';


import  WorkflowStateChart  from '../chart/WorkflowStateChart';
import  WorkflowStateForm  from '../form/WorkflowStateForm';
import  WorkflowStateTable from '../table/WorkflowStateTable';



const DataWorkbook = () => {

    const [activeTab, setActiveTab] = useState('');
  
    return (
        <Container fluid className="p-3">
                <Nav
                    variant="tabs" 
                    defaultActiveKey={activeTab}
                    id="fill-tab"
                    className="mb-3"
                    fill
                >
                    <Nav.Item>
                        <NavDropdown
                            id="spec"
                            title='Select Local API'
                        >
    

                            <NavDropdown.Item
                                title='AclEntry'
                                active={ activeTab == 'AclEntry' }
                                onClick={() => {
                                    setActiveTab("AclEntry");
                                }}
                                key={ 'AclEntry' }
                                    >
                                {/* DataChart Section */}                  
<h5>Acl Entry</h5>
AclEntry
                            </NavDropdown.Item>


                            <NavDropdown.Item
                                title='Address'
                                active={ activeTab == 'Address' }
                                onClick={() => {
                                    setActiveTab("Address");
                                }}
                                key={ 'Address' }
                                    >
                                {/* DataChart Section */}                  
<h5>Address</h5>
Address
                            </NavDropdown.Item>


                            <NavDropdown.Item
                                title='Application'
                                active={ activeTab == 'Application' }
                                onClick={() => {
                                    setActiveTab("Application");
                                }}
                                key={ 'Application' }
                                    >
                                {/* DataChart Section */}                  
<h5>Application</h5>
Application
                            </NavDropdown.Item>


                            <NavDropdown.Item
                                title='BackupConfig'
                                active={ activeTab == 'BackupConfig' }
                                onClick={() => {
                                    setActiveTab("BackupConfig");
                                }}
                                key={ 'BackupConfig' }
                                    >
                                {/* DataChart Section */}                  
<h5>Backup Config</h5>
BackupConfig
                            </NavDropdown.Item>


                            <NavDropdown.Item
                                title='BlankRange'
                                active={ activeTab == 'BlankRange' }
                                onClick={() => {
                                    setActiveTab("BlankRange");
                                }}
                                key={ 'BlankRange' }
                                    >
                                {/* DataChart Section */}                  
<h5>Blank Range</h5>
BlankRange
                            </NavDropdown.Item>


                            <NavDropdown.Item
                                title='Border'
                                active={ activeTab == 'Border' }
                                onClick={() => {
                                    setActiveTab("Border");
                                }}
                                key={ 'Border' }
                                    >
                                {/* DataChart Section */}                  
<h5>Border</h5>
Border
                            </NavDropdown.Item>


                            <NavDropdown.Item
                                title='Build'
                                active={ activeTab == 'Build' }
                                onClick={() => {
                                    setActiveTab("Build");
                                }}
                                key={ 'Build' }
                                    >
                                {/* DataChart Section */}                  
<h5>Build</h5>
Build
                            </NavDropdown.Item>


                            <NavDropdown.Item
                                title='BuildOutput'
                                active={ activeTab == 'BuildOutput' }
                                onClick={() => {
                                    setActiveTab("BuildOutput");
                                }}
                                key={ 'BuildOutput' }
                                    >
                                {/* DataChart Section */}                  
<h5>Build Output</h5>
BuildOutput
                            </NavDropdown.Item>


                            <NavDropdown.Item
                                title='Campaign'
                                active={ activeTab == 'Campaign' }
                                onClick={() => {
                                    setActiveTab("Campaign");
                                }}
                                key={ 'Campaign' }
                                    >
                                {/* DataChart Section */}                  
<h5>Campaign</h5>
Campaign
                            </NavDropdown.Item>


                            <NavDropdown.Item
                                title='Cell'
                                active={ activeTab == 'Cell' }
                                onClick={() => {
                                    setActiveTab("Cell");
                                }}
                                key={ 'Cell' }
                                    >
                                {/* DataChart Section */}                  
<h5>Cell</h5>
Cell
                            </NavDropdown.Item>


                            <NavDropdown.Item
                                title='Chart'
                                active={ activeTab == 'Chart' }
                                onClick={() => {
                                    setActiveTab("Chart");
                                }}
                                key={ 'Chart' }
                                    >
                                {/* DataChart Section */}                  
<h5>Chart</h5>
Chart
                            </NavDropdown.Item>


                            <NavDropdown.Item
                                title='ChartSeries'
                                active={ activeTab == 'ChartSeries' }
                                onClick={() => {
                                    setActiveTab("ChartSeries");
                                }}
                                key={ 'ChartSeries' }
                                    >
                                {/* DataChart Section */}                  
<h5>Chart Series</h5>
ChartSeries
                            </NavDropdown.Item>


                            <NavDropdown.Item
                                title='ChatMessage'
                                active={ activeTab == 'ChatMessage' }
                                onClick={() => {
                                    setActiveTab("ChatMessage");
                                }}
                                key={ 'ChatMessage' }
                                    >
                                {/* DataChart Section */}                  
<h5>Chat Message</h5>
ChatMessage
                            </NavDropdown.Item>


                            <NavDropdown.Item
                                title='ChatResponse'
                                active={ activeTab == 'ChatResponse' }
                                onClick={() => {
                                    setActiveTab("ChatResponse");
                                }}
                                key={ 'ChatResponse' }
                                    >
                                {/* DataChart Section */}                  
<h5>Chat Response</h5>
ChatResponse
                            </NavDropdown.Item>


                            <NavDropdown.Item
                                title='ContentData'
                                active={ activeTab == 'ContentData' }
                                onClick={() => {
                                    setActiveTab("ContentData");
                                }}
                                key={ 'ContentData' }
                                    >
                                {/* DataChart Section */}                  
<h5>Content Data</h5>
ContentData
                            </NavDropdown.Item>


                            <NavDropdown.Item
                                title='ContentMediaLink'
                                active={ activeTab == 'ContentMediaLink' }
                                onClick={() => {
                                    setActiveTab("ContentMediaLink");
                                }}
                                key={ 'ContentMediaLink' }
                                    >
                                {/* DataChart Section */}                  
<h5>Content Media Link</h5>
ContentMediaLink
                            </NavDropdown.Item>


                            <NavDropdown.Item
                                title='Customer'
                                active={ activeTab == 'Customer' }
                                onClick={() => {
                                    setActiveTab("Customer");
                                }}
                                key={ 'Customer' }
                                    >
                                {/* DataChart Section */}                  
<h5>Customer</h5>
Customer
                            </NavDropdown.Item>


                            <NavDropdown.Item
                                title='EventLog'
                                active={ activeTab == 'EventLog' }
                                onClick={() => {
                                    setActiveTab("EventLog");
                                }}
                                key={ 'EventLog' }
                                    >
                                {/* DataChart Section */}                  
<h5>Event Log</h5>
EventLog
                            </NavDropdown.Item>


                            <NavDropdown.Item
                                title='ExecModule'
                                active={ activeTab == 'ExecModule' }
                                onClick={() => {
                                    setActiveTab("ExecModule");
                                }}
                                key={ 'ExecModule' }
                                    >
                                {/* DataChart Section */}                  
<h5>Exec Module</h5>
ExecModule
                            </NavDropdown.Item>


                            <NavDropdown.Item
                                title='Format'
                                active={ activeTab == 'Format' }
                                onClick={() => {
                                    setActiveTab("Format");
                                }}
                                key={ 'Format' }
                                    >
                                {/* DataChart Section */}                  
<h5>Format</h5>
Format
                            </NavDropdown.Item>


                            <NavDropdown.Item
                                title='Formula'
                                active={ activeTab == 'Formula' }
                                onClick={() => {
                                    setActiveTab("Formula");
                                }}
                                key={ 'Formula' }
                                    >
                                {/* DataChart Section */}                  
<h5>Formula</h5>
Formula
                            </NavDropdown.Item>


                            <NavDropdown.Item
                                title='Game'
                                active={ activeTab == 'Game' }
                                onClick={() => {
                                    setActiveTab("Game");
                                }}
                                key={ 'Game' }
                                    >
                                {/* DataChart Section */}                  
<h5>Game</h5>
Game
                            </NavDropdown.Item>


                            <NavDropdown.Item
                                title='Goal'
                                active={ activeTab == 'Goal' }
                                onClick={() => {
                                    setActiveTab("Goal");
                                }}
                                key={ 'Goal' }
                                    >
                                {/* DataChart Section */}                  
<h5>Goal</h5>
Goal
                            </NavDropdown.Item>


                            <NavDropdown.Item
                                title='GoalDependency'
                                active={ activeTab == 'GoalDependency' }
                                onClick={() => {
                                    setActiveTab("GoalDependency");
                                }}
                                key={ 'GoalDependency' }
                                    >
                                {/* DataChart Section */}                  
<h5>Goal Dependency</h5>
GoalDependency
                            </NavDropdown.Item>


                            <NavDropdown.Item
                                title='IntegrationAccount'
                                active={ activeTab == 'IntegrationAccount' }
                                onClick={() => {
                                    setActiveTab("IntegrationAccount");
                                }}
                                key={ 'IntegrationAccount' }
                                    >
                                {/* DataChart Section */}                  
<h5>Integration Account</h5>
IntegrationAccount
                            </NavDropdown.Item>


                            <NavDropdown.Item
                                title='Invoice'
                                active={ activeTab == 'Invoice' }
                                onClick={() => {
                                    setActiveTab("Invoice");
                                }}
                                key={ 'Invoice' }
                                    >
                                {/* DataChart Section */}                  
<h5>Invoice</h5>
Invoice
                            </NavDropdown.Item>


                            <NavDropdown.Item
                                title='KeyMetric'
                                active={ activeTab == 'KeyMetric' }
                                onClick={() => {
                                    setActiveTab("KeyMetric");
                                }}
                                key={ 'KeyMetric' }
                                    >
                                {/* DataChart Section */}                  
<h5>Key Metric</h5>
KeyMetric
                            </NavDropdown.Item>


                            <NavDropdown.Item
                                title='LlmDetails'
                                active={ activeTab == 'LlmDetails' }
                                onClick={() => {
                                    setActiveTab("LlmDetails");
                                }}
                                key={ 'LlmDetails' }
                                    >
                                {/* DataChart Section */}                  
<h5>Llm Details</h5>
LlmDetails
                            </NavDropdown.Item>


                            <NavDropdown.Item
                                title='Login'
                                active={ activeTab == 'Login' }
                                onClick={() => {
                                    setActiveTab("Login");
                                }}
                                key={ 'Login' }
                                    >
                                {/* DataChart Section */}                  
<h5>Login</h5>
Login
                            </NavDropdown.Item>


                            <NavDropdown.Item
                                title='Logout'
                                active={ activeTab == 'Logout' }
                                onClick={() => {
                                    setActiveTab("Logout");
                                }}
                                key={ 'Logout' }
                                    >
                                {/* DataChart Section */}                  
<h5>Logout</h5>
Logout
                            </NavDropdown.Item>


                            <NavDropdown.Item
                                title='MediaObject'
                                active={ activeTab == 'MediaObject' }
                                onClick={() => {
                                    setActiveTab("MediaObject");
                                }}
                                key={ 'MediaObject' }
                                    >
                                {/* DataChart Section */}                  
<h5>Media Object</h5>
MediaObject
                            </NavDropdown.Item>


                            <NavDropdown.Item
                                title='MergeRange'
                                active={ activeTab == 'MergeRange' }
                                onClick={() => {
                                    setActiveTab("MergeRange");
                                }}
                                key={ 'MergeRange' }
                                    >
                                {/* DataChart Section */}                  
<h5>Merge Range</h5>
MergeRange
                            </NavDropdown.Item>


                            <NavDropdown.Item
                                title='NamedRange'
                                active={ activeTab == 'NamedRange' }
                                onClick={() => {
                                    setActiveTab("NamedRange");
                                }}
                                key={ 'NamedRange' }
                                    >
                                {/* DataChart Section */}                  
<h5>Named Range</h5>
NamedRange
                            </NavDropdown.Item>


                            <NavDropdown.Item
                                title='Note'
                                active={ activeTab == 'Note' }
                                onClick={() => {
                                    setActiveTab("Note");
                                }}
                                key={ 'Note' }
                                    >
                                {/* DataChart Section */}                  
<h5>Note</h5>
Note
                            </NavDropdown.Item>


                            <NavDropdown.Item
                                title='OasComponents'
                                active={ activeTab == 'OasComponents' }
                                onClick={() => {
                                    setActiveTab("OasComponents");
                                }}
                                key={ 'OasComponents' }
                                    >
                                {/* DataChart Section */}                  
<h5>Oas Components</h5>
OasComponents
                            </NavDropdown.Item>


                            <NavDropdown.Item
                                title='OasEnum'
                                active={ activeTab == 'OasEnum' }
                                onClick={() => {
                                    setActiveTab("OasEnum");
                                }}
                                key={ 'OasEnum' }
                                    >
                                {/* DataChart Section */}                  
<h5>Oas Enum</h5>
OasEnum
                            </NavDropdown.Item>


                            <NavDropdown.Item
                                title='OasInfo'
                                active={ activeTab == 'OasInfo' }
                                onClick={() => {
                                    setActiveTab("OasInfo");
                                }}
                                key={ 'OasInfo' }
                                    >
                                {/* DataChart Section */}                  
<h5>Oas Info</h5>
OasInfo
                            </NavDropdown.Item>


                            <NavDropdown.Item
                                title='OasObjectSchema'
                                active={ activeTab == 'OasObjectSchema' }
                                onClick={() => {
                                    setActiveTab("OasObjectSchema");
                                }}
                                key={ 'OasObjectSchema' }
                                    >
                                {/* DataChart Section */}                  
<h5>Oas Object Schema</h5>
OasObjectSchema
                            </NavDropdown.Item>


                            <NavDropdown.Item
                                title='OasOpenAPISpec'
                                active={ activeTab == 'OasOpenAPISpec' }
                                onClick={() => {
                                    setActiveTab("OasOpenAPISpec");
                                }}
                                key={ 'OasOpenAPISpec' }
                                    >
                                {/* DataChart Section */}                  
<h5>Oas Open API Spec</h5>
OasOpenAPISpec
                            </NavDropdown.Item>


                            <NavDropdown.Item
                                title='OasOperation'
                                active={ activeTab == 'OasOperation' }
                                onClick={() => {
                                    setActiveTab("OasOperation");
                                }}
                                key={ 'OasOperation' }
                                    >
                                {/* DataChart Section */}                  
<h5>Oas Operation</h5>
OasOperation
                            </NavDropdown.Item>


                            <NavDropdown.Item
                                title='OasParameter'
                                active={ activeTab == 'OasParameter' }
                                onClick={() => {
                                    setActiveTab("OasParameter");
                                }}
                                key={ 'OasParameter' }
                                    >
                                {/* DataChart Section */}                  
<h5>Oas Parameter</h5>
OasParameter
                            </NavDropdown.Item>


                            <NavDropdown.Item
                                title='OasPath'
                                active={ activeTab == 'OasPath' }
                                onClick={() => {
                                    setActiveTab("OasPath");
                                }}
                                key={ 'OasPath' }
                                    >
                                {/* DataChart Section */}                  
<h5>Oas Path</h5>
OasPath
                            </NavDropdown.Item>


                            <NavDropdown.Item
                                title='OasRequired'
                                active={ activeTab == 'OasRequired' }
                                onClick={() => {
                                    setActiveTab("OasRequired");
                                }}
                                key={ 'OasRequired' }
                                    >
                                {/* DataChart Section */}                  
<h5>Oas Required</h5>
OasRequired
                            </NavDropdown.Item>


                            <NavDropdown.Item
                                title='OasResponse'
                                active={ activeTab == 'OasResponse' }
                                onClick={() => {
                                    setActiveTab("OasResponse");
                                }}
                                key={ 'OasResponse' }
                                    >
                                {/* DataChart Section */}                  
<h5>Oas Response</h5>
OasResponse
                            </NavDropdown.Item>


                            <NavDropdown.Item
                                title='OasSecurityScheme'
                                active={ activeTab == 'OasSecurityScheme' }
                                onClick={() => {
                                    setActiveTab("OasSecurityScheme");
                                }}
                                key={ 'OasSecurityScheme' }
                                    >
                                {/* DataChart Section */}                  
<h5>Oas Security Scheme</h5>
OasSecurityScheme
                            </NavDropdown.Item>


                            <NavDropdown.Item
                                title='OasServer'
                                active={ activeTab == 'OasServer' }
                                onClick={() => {
                                    setActiveTab("OasServer");
                                }}
                                key={ 'OasServer' }
                                    >
                                {/* DataChart Section */}                  
<h5>Oas Server</h5>
OasServer
                            </NavDropdown.Item>


                            <NavDropdown.Item
                                title='Opportunity'
                                active={ activeTab == 'Opportunity' }
                                onClick={() => {
                                    setActiveTab("Opportunity");
                                }}
                                key={ 'Opportunity' }
                                    >
                                {/* DataChart Section */}                  
<h5>Opportunity</h5>
Opportunity
                            </NavDropdown.Item>


                            <NavDropdown.Item
                                title='Organization'
                                active={ activeTab == 'Organization' }
                                onClick={() => {
                                    setActiveTab("Organization");
                                }}
                                key={ 'Organization' }
                                    >
                                {/* DataChart Section */}                  
<h5>Organization</h5>
Organization
                            </NavDropdown.Item>


                            <NavDropdown.Item
                                title='PivotTable'
                                active={ activeTab == 'PivotTable' }
                                onClick={() => {
                                    setActiveTab("PivotTable");
                                }}
                                key={ 'PivotTable' }
                                    >
                                {/* DataChart Section */}                  
<h5>Pivot Table</h5>
PivotTable
                            </NavDropdown.Item>


                            <NavDropdown.Item
                                title='Principal'
                                active={ activeTab == 'Principal' }
                                onClick={() => {
                                    setActiveTab("Principal");
                                }}
                                key={ 'Principal' }
                                    >
                                {/* DataChart Section */}                  
<h5>Principal</h5>
Principal
                            </NavDropdown.Item>


                            <NavDropdown.Item
                                title='Product'
                                active={ activeTab == 'Product' }
                                onClick={() => {
                                    setActiveTab("Product");
                                }}
                                key={ 'Product' }
                                    >
                                {/* DataChart Section */}                  
<h5>Product</h5>
Product
                            </NavDropdown.Item>


                            <NavDropdown.Item
                                title='Ptg'
                                active={ activeTab == 'Ptg' }
                                onClick={() => {
                                    setActiveTab("Ptg");
                                }}
                                key={ 'Ptg' }
                                    >
                                {/* DataChart Section */}                  
<h5>Ptg</h5>
Ptg
                            </NavDropdown.Item>


                            <NavDropdown.Item
                                title='PtgRef'
                                active={ activeTab == 'PtgRef' }
                                onClick={() => {
                                    setActiveTab("PtgRef");
                                }}
                                key={ 'PtgRef' }
                                    >
                                {/* DataChart Section */}                  
<h5>Ptg Ref</h5>
PtgRef
                            </NavDropdown.Item>


                            <NavDropdown.Item
                                title='Rating'
                                active={ activeTab == 'Rating' }
                                onClick={() => {
                                    setActiveTab("Rating");
                                }}
                                key={ 'Rating' }
                                    >
                                {/* DataChart Section */}                  
<h5>Rating</h5>
Rating
                            </NavDropdown.Item>


                            <NavDropdown.Item
                                title='Role'
                                active={ activeTab == 'Role' }
                                onClick={() => {
                                    setActiveTab("Role");
                                }}
                                key={ 'Role' }
                                    >
                                {/* DataChart Section */}                  
<h5>Role</h5>
Role
                            </NavDropdown.Item>


                            <NavDropdown.Item
                                title='SalesActivity'
                                active={ activeTab == 'SalesActivity' }
                                onClick={() => {
                                    setActiveTab("SalesActivity");
                                }}
                                key={ 'SalesActivity' }
                                    >
                                {/* DataChart Section */}                  
<h5>Sales Activity</h5>
SalesActivity
                            </NavDropdown.Item>


                            <NavDropdown.Item
                                title='SalesOrder'
                                active={ activeTab == 'SalesOrder' }
                                onClick={() => {
                                    setActiveTab("SalesOrder");
                                }}
                                key={ 'SalesOrder' }
                                    >
                                {/* DataChart Section */}                  
<h5>Sales Order</h5>
SalesOrder
                            </NavDropdown.Item>


                            <NavDropdown.Item
                                title='SalesPipeline'
                                active={ activeTab == 'SalesPipeline' }
                                onClick={() => {
                                    setActiveTab("SalesPipeline");
                                }}
                                key={ 'SalesPipeline' }
                                    >
                                {/* DataChart Section */}                  
<h5>Sales Pipeline</h5>
SalesPipeline
                            </NavDropdown.Item>


                            <NavDropdown.Item
                                title='SecureKey'
                                active={ activeTab == 'SecureKey' }
                                onClick={() => {
                                    setActiveTab("SecureKey");
                                }}
                                key={ 'SecureKey' }
                                    >
                                {/* DataChart Section */}                  
<h5>Secure Key</h5>
SecureKey
                            </NavDropdown.Item>


                            <NavDropdown.Item
                                title='Sheet'
                                active={ activeTab == 'Sheet' }
                                onClick={() => {
                                    setActiveTab("Sheet");
                                }}
                                key={ 'Sheet' }
                                    >
                                {/* DataChart Section */}                  
<h5>Sheet</h5>
Sheet
                            </NavDropdown.Item>


                            <NavDropdown.Item
                                title='SheetColumn'
                                active={ activeTab == 'SheetColumn' }
                                onClick={() => {
                                    setActiveTab("SheetColumn");
                                }}
                                key={ 'SheetColumn' }
                                    >
                                {/* DataChart Section */}                  
<h5>Sheet Column</h5>
SheetColumn
                            </NavDropdown.Item>


                            <NavDropdown.Item
                                title='SheetRow'
                                active={ activeTab == 'SheetRow' }
                                onClick={() => {
                                    setActiveTab("SheetRow");
                                }}
                                key={ 'SheetRow' }
                                    >
                                {/* DataChart Section */}                  
<h5>Sheet Row</h5>
SheetRow
                            </NavDropdown.Item>


                            <NavDropdown.Item
                                title='Solution'
                                active={ activeTab == 'Solution' }
                                onClick={() => {
                                    setActiveTab("Solution");
                                }}
                                key={ 'Solution' }
                                    >
                                {/* DataChart Section */}                  
<h5>Solution</h5>
Solution
                            </NavDropdown.Item>


                            <NavDropdown.Item
                                title='StrategicPriority'
                                active={ activeTab == 'StrategicPriority' }
                                onClick={() => {
                                    setActiveTab("StrategicPriority");
                                }}
                                key={ 'StrategicPriority' }
                                    >
                                {/* DataChart Section */}                  
<h5>Strategic Priority</h5>
StrategicPriority
                            </NavDropdown.Item>


                            <NavDropdown.Item
                                title='Task'
                                active={ activeTab == 'Task' }
                                onClick={() => {
                                    setActiveTab("Task");
                                }}
                                key={ 'Task' }
                                    >
                                {/* DataChart Section */}                  
<h5>Task</h5>
Task
                            </NavDropdown.Item>


                            <NavDropdown.Item
                                title='ThorUXComponent'
                                active={ activeTab == 'ThorUXComponent' }
                                onClick={() => {
                                    setActiveTab("ThorUXComponent");
                                }}
                                key={ 'ThorUXComponent' }
                                    >
                                {/* DataChart Section */}                  
<h5>Thor UX Component</h5>
ThorUXComponent
                            </NavDropdown.Item>


                            <NavDropdown.Item
                                title='ThorUXMeta'
                                active={ activeTab == 'ThorUXMeta' }
                                onClick={() => {
                                    setActiveTab("ThorUXMeta");
                                }}
                                key={ 'ThorUXMeta' }
                                    >
                                {/* DataChart Section */}                  
<h5>Thor UX Meta</h5>
ThorUXMeta
                            </NavDropdown.Item>


                            <NavDropdown.Item
                                title='Weapon'
                                active={ activeTab == 'Weapon' }
                                onClick={() => {
                                    setActiveTab("Weapon");
                                }}
                                key={ 'Weapon' }
                                    >
                                {/* DataChart Section */}                  
<h5>Weapon</h5>
Weapon
                            </NavDropdown.Item>


                            <NavDropdown.Item
                                title='Workbook'
                                active={ activeTab == 'Workbook' }
                                onClick={() => {
                                    setActiveTab("Workbook");
                                }}
                                key={ 'Workbook' }
                                    >
                                {/* DataChart Section */}                  
<h5>Workbook</h5>
Workbook
                            </NavDropdown.Item>


                            <NavDropdown.Item
                                title='Workflow'
                                active={ activeTab == 'Workflow' }
                                onClick={() => {
                                    setActiveTab("Workflow");
                                }}
                                key={ 'Workflow' }
                                    >
                                {/* DataChart Section */}                  
<h5>Workflow</h5>
Workflow
                            </NavDropdown.Item>


                            <NavDropdown.Item
                                title='WorkflowState'
                                active={ activeTab == 'WorkflowState' }
                                onClick={() => {
                                    setActiveTab("WorkflowState");
                                }}
                                key={ 'WorkflowState' }
                                    >
                                {/* DataChart Section */}                  
<h5>Workflow State</h5>
WorkflowState
                            </NavDropdown.Item>

                        </NavDropdown>
                    </Nav.Item>
            </Nav>

            <Tabs>

            <Tab
             title={null}
             eventKey="AclEntry" 
             active={ activeTab == 'AclEntry' }
            >
                <h1>AclEntry</h1>
                <Tabs key={'AclEntry'}>
                    <Tab title='AclEntry Chart'
                            eventKey="AclEntryC"
                    >
                        <AclEntryChart /> 
                    </Tab>     
                    <Tab title='AclEntry Table'
                            eventKey="AclEntryT"
                    >
                        <AclEntryTable />
                    </Tab>
                    <Tab title='Edit AclEntry'
                            eventKey="AclEntryF"
                    >
                        <AclEntryForm />
                    </Tab>
                </Tabs>
            </Tab>

            <Tab
             title={null}
             eventKey="Address" 
             active={ activeTab == 'Address' }
            >
                <h1>Address</h1>
                <Tabs key={'Address'}>
                    <Tab title='Address Chart'
                            eventKey="AddressC"
                    >
                        <AddressChart /> 
                    </Tab>     
                    <Tab title='Address Table'
                            eventKey="AddressT"
                    >
                        <AddressTable />
                    </Tab>
                    <Tab title='Edit Address'
                            eventKey="AddressF"
                    >
                        <AddressForm />
                    </Tab>
                </Tabs>
            </Tab>

            <Tab
             title={null}
             eventKey="Application" 
             active={ activeTab == 'Application' }
            >
                <h1>Application</h1>
                <Tabs key={'Application'}>
                    <Tab title='Application Chart'
                            eventKey="ApplicationC"
                    >
                        <ApplicationChart /> 
                    </Tab>     
                    <Tab title='Application Table'
                            eventKey="ApplicationT"
                    >
                        <ApplicationTable />
                    </Tab>
                    <Tab title='Edit Application'
                            eventKey="ApplicationF"
                    >
                        <ApplicationForm />
                    </Tab>
                </Tabs>
            </Tab>

            <Tab
             title={null}
             eventKey="BackupConfig" 
             active={ activeTab == 'BackupConfig' }
            >
                <h1>BackupConfig</h1>
                <Tabs key={'BackupConfig'}>
                    <Tab title='BackupConfig Chart'
                            eventKey="BackupConfigC"
                    >
                        <BackupConfigChart /> 
                    </Tab>     
                    <Tab title='BackupConfig Table'
                            eventKey="BackupConfigT"
                    >
                        <BackupConfigTable />
                    </Tab>
                    <Tab title='Edit BackupConfig'
                            eventKey="BackupConfigF"
                    >
                        <BackupConfigForm />
                    </Tab>
                </Tabs>
            </Tab>

            <Tab
             title={null}
             eventKey="BlankRange" 
             active={ activeTab == 'BlankRange' }
            >
                <h1>BlankRange</h1>
                <Tabs key={'BlankRange'}>
                    <Tab title='BlankRange Chart'
                            eventKey="BlankRangeC"
                    >
                        <BlankRangeChart /> 
                    </Tab>     
                    <Tab title='BlankRange Table'
                            eventKey="BlankRangeT"
                    >
                        <BlankRangeTable />
                    </Tab>
                    <Tab title='Edit BlankRange'
                            eventKey="BlankRangeF"
                    >
                        <BlankRangeForm />
                    </Tab>
                </Tabs>
            </Tab>

            <Tab
             title={null}
             eventKey="Border" 
             active={ activeTab == 'Border' }
            >
                <h1>Border</h1>
                <Tabs key={'Border'}>
                    <Tab title='Border Chart'
                            eventKey="BorderC"
                    >
                        <BorderChart /> 
                    </Tab>     
                    <Tab title='Border Table'
                            eventKey="BorderT"
                    >
                        <BorderTable />
                    </Tab>
                    <Tab title='Edit Border'
                            eventKey="BorderF"
                    >
                        <BorderForm />
                    </Tab>
                </Tabs>
            </Tab>

            <Tab
             title={null}
             eventKey="Build" 
             active={ activeTab == 'Build' }
            >
                <h1>Build</h1>
                <Tabs key={'Build'}>
                    <Tab title='Build Chart'
                            eventKey="BuildC"
                    >
                        <BuildChart /> 
                    </Tab>     
                    <Tab title='Build Table'
                            eventKey="BuildT"
                    >
                        <BuildTable />
                    </Tab>
                    <Tab title='Edit Build'
                            eventKey="BuildF"
                    >
                        <BuildForm />
                    </Tab>
                </Tabs>
            </Tab>

            <Tab
             title={null}
             eventKey="BuildOutput" 
             active={ activeTab == 'BuildOutput' }
            >
                <h1>BuildOutput</h1>
                <Tabs key={'BuildOutput'}>
                    <Tab title='BuildOutput Chart'
                            eventKey="BuildOutputC"
                    >
                        <BuildOutputChart /> 
                    </Tab>     
                    <Tab title='BuildOutput Table'
                            eventKey="BuildOutputT"
                    >
                        <BuildOutputTable />
                    </Tab>
                    <Tab title='Edit BuildOutput'
                            eventKey="BuildOutputF"
                    >
                        <BuildOutputForm />
                    </Tab>
                </Tabs>
            </Tab>

            <Tab
             title={null}
             eventKey="Campaign" 
             active={ activeTab == 'Campaign' }
            >
                <h1>Campaign</h1>
                <Tabs key={'Campaign'}>
                    <Tab title='Campaign Chart'
                            eventKey="CampaignC"
                    >
                        <CampaignChart /> 
                    </Tab>     
                    <Tab title='Campaign Table'
                            eventKey="CampaignT"
                    >
                        <CampaignTable />
                    </Tab>
                    <Tab title='Edit Campaign'
                            eventKey="CampaignF"
                    >
                        <CampaignForm />
                    </Tab>
                </Tabs>
            </Tab>

            <Tab
             title={null}
             eventKey="Cell" 
             active={ activeTab == 'Cell' }
            >
                <h1>Cell</h1>
                <Tabs key={'Cell'}>
                    <Tab title='Cell Chart'
                            eventKey="CellC"
                    >
                        <CellChart /> 
                    </Tab>     
                    <Tab title='Cell Table'
                            eventKey="CellT"
                    >
                        <CellTable />
                    </Tab>
                    <Tab title='Edit Cell'
                            eventKey="CellF"
                    >
                        <CellForm />
                    </Tab>
                </Tabs>
            </Tab>

            <Tab
             title={null}
             eventKey="Chart" 
             active={ activeTab == 'Chart' }
            >
                <h1>Chart</h1>
                <Tabs key={'Chart'}>
                    <Tab title='Chart Chart'
                            eventKey="ChartC"
                    >
                        <ChartChart /> 
                    </Tab>     
                    <Tab title='Chart Table'
                            eventKey="ChartT"
                    >
                        <ChartTable />
                    </Tab>
                    <Tab title='Edit Chart'
                            eventKey="ChartF"
                    >
                        <ChartForm />
                    </Tab>
                </Tabs>
            </Tab>

            <Tab
             title={null}
             eventKey="ChartSeries" 
             active={ activeTab == 'ChartSeries' }
            >
                <h1>ChartSeries</h1>
                <Tabs key={'ChartSeries'}>
                    <Tab title='ChartSeries Chart'
                            eventKey="ChartSeriesC"
                    >
                        <ChartSeriesChart /> 
                    </Tab>     
                    <Tab title='ChartSeries Table'
                            eventKey="ChartSeriesT"
                    >
                        <ChartSeriesTable />
                    </Tab>
                    <Tab title='Edit ChartSeries'
                            eventKey="ChartSeriesF"
                    >
                        <ChartSeriesForm />
                    </Tab>
                </Tabs>
            </Tab>

            <Tab
             title={null}
             eventKey="ChatMessage" 
             active={ activeTab == 'ChatMessage' }
            >
                <h1>ChatMessage</h1>
                <Tabs key={'ChatMessage'}>
                    <Tab title='ChatMessage Chart'
                            eventKey="ChatMessageC"
                    >
                        <ChatMessageChart /> 
                    </Tab>     
                    <Tab title='ChatMessage Table'
                            eventKey="ChatMessageT"
                    >
                        <ChatMessageTable />
                    </Tab>
                    <Tab title='Edit ChatMessage'
                            eventKey="ChatMessageF"
                    >
                        <ChatMessageForm />
                    </Tab>
                </Tabs>
            </Tab>

            <Tab
             title={null}
             eventKey="ChatResponse" 
             active={ activeTab == 'ChatResponse' }
            >
                <h1>ChatResponse</h1>
                <Tabs key={'ChatResponse'}>
                    <Tab title='ChatResponse Chart'
                            eventKey="ChatResponseC"
                    >
                        <ChatResponseChart /> 
                    </Tab>     
                    <Tab title='ChatResponse Table'
                            eventKey="ChatResponseT"
                    >
                        <ChatResponseTable />
                    </Tab>
                    <Tab title='Edit ChatResponse'
                            eventKey="ChatResponseF"
                    >
                        <ChatResponseForm />
                    </Tab>
                </Tabs>
            </Tab>

            <Tab
             title={null}
             eventKey="ContentData" 
             active={ activeTab == 'ContentData' }
            >
                <h1>ContentData</h1>
                <Tabs key={'ContentData'}>
                    <Tab title='ContentData Chart'
                            eventKey="ContentDataC"
                    >
                        <ContentDataChart /> 
                    </Tab>     
                    <Tab title='ContentData Table'
                            eventKey="ContentDataT"
                    >
                        <ContentDataTable />
                    </Tab>
                    <Tab title='Edit ContentData'
                            eventKey="ContentDataF"
                    >
                        <ContentDataForm />
                    </Tab>
                </Tabs>
            </Tab>

            <Tab
             title={null}
             eventKey="ContentMediaLink" 
             active={ activeTab == 'ContentMediaLink' }
            >
                <h1>ContentMediaLink</h1>
                <Tabs key={'ContentMediaLink'}>
                    <Tab title='ContentMediaLink Chart'
                            eventKey="ContentMediaLinkC"
                    >
                        <ContentMediaLinkChart /> 
                    </Tab>     
                    <Tab title='ContentMediaLink Table'
                            eventKey="ContentMediaLinkT"
                    >
                        <ContentMediaLinkTable />
                    </Tab>
                    <Tab title='Edit ContentMediaLink'
                            eventKey="ContentMediaLinkF"
                    >
                        <ContentMediaLinkForm />
                    </Tab>
                </Tabs>
            </Tab>

            <Tab
             title={null}
             eventKey="Customer" 
             active={ activeTab == 'Customer' }
            >
                <h1>Customer</h1>
                <Tabs key={'Customer'}>
                    <Tab title='Customer Chart'
                            eventKey="CustomerC"
                    >
                        <CustomerChart /> 
                    </Tab>     
                    <Tab title='Customer Table'
                            eventKey="CustomerT"
                    >
                        <CustomerTable />
                    </Tab>
                    <Tab title='Edit Customer'
                            eventKey="CustomerF"
                    >
                        <CustomerForm />
                    </Tab>
                </Tabs>
            </Tab>

            <Tab
             title={null}
             eventKey="EventLog" 
             active={ activeTab == 'EventLog' }
            >
                <h1>EventLog</h1>
                <Tabs key={'EventLog'}>
                    <Tab title='EventLog Chart'
                            eventKey="EventLogC"
                    >
                        <EventLogChart /> 
                    </Tab>     
                    <Tab title='EventLog Table'
                            eventKey="EventLogT"
                    >
                        <EventLogTable />
                    </Tab>
                    <Tab title='Edit EventLog'
                            eventKey="EventLogF"
                    >
                        <EventLogForm />
                    </Tab>
                </Tabs>
            </Tab>

            <Tab
             title={null}
             eventKey="ExecModule" 
             active={ activeTab == 'ExecModule' }
            >
                <h1>ExecModule</h1>
                <Tabs key={'ExecModule'}>
                    <Tab title='ExecModule Chart'
                            eventKey="ExecModuleC"
                    >
                        <ExecModuleChart /> 
                    </Tab>     
                    <Tab title='ExecModule Table'
                            eventKey="ExecModuleT"
                    >
                        <ExecModuleTable />
                    </Tab>
                    <Tab title='Edit ExecModule'
                            eventKey="ExecModuleF"
                    >
                        <ExecModuleForm />
                    </Tab>
                </Tabs>
            </Tab>

            <Tab
             title={null}
             eventKey="Format" 
             active={ activeTab == 'Format' }
            >
                <h1>Format</h1>
                <Tabs key={'Format'}>
                    <Tab title='Format Chart'
                            eventKey="FormatC"
                    >
                        <FormatChart /> 
                    </Tab>     
                    <Tab title='Format Table'
                            eventKey="FormatT"
                    >
                        <FormatTable />
                    </Tab>
                    <Tab title='Edit Format'
                            eventKey="FormatF"
                    >
                        <FormatForm />
                    </Tab>
                </Tabs>
            </Tab>

            <Tab
             title={null}
             eventKey="Formula" 
             active={ activeTab == 'Formula' }
            >
                <h1>Formula</h1>
                <Tabs key={'Formula'}>
                    <Tab title='Formula Chart'
                            eventKey="FormulaC"
                    >
                        <FormulaChart /> 
                    </Tab>     
                    <Tab title='Formula Table'
                            eventKey="FormulaT"
                    >
                        <FormulaTable />
                    </Tab>
                    <Tab title='Edit Formula'
                            eventKey="FormulaF"
                    >
                        <FormulaForm />
                    </Tab>
                </Tabs>
            </Tab>

            <Tab
             title={null}
             eventKey="Game" 
             active={ activeTab == 'Game' }
            >
                <h1>Game</h1>
                <Tabs key={'Game'}>
                    <Tab title='Game Chart'
                            eventKey="GameC"
                    >
                        <GameChart /> 
                    </Tab>     
                    <Tab title='Game Table'
                            eventKey="GameT"
                    >
                        <GameTable />
                    </Tab>
                    <Tab title='Edit Game'
                            eventKey="GameF"
                    >
                        <GameForm />
                    </Tab>
                </Tabs>
            </Tab>

            <Tab
             title={null}
             eventKey="Goal" 
             active={ activeTab == 'Goal' }
            >
                <h1>Goal</h1>
                <Tabs key={'Goal'}>
                    <Tab title='Goal Chart'
                            eventKey="GoalC"
                    >
                        <GoalChart /> 
                    </Tab>     
                    <Tab title='Goal Table'
                            eventKey="GoalT"
                    >
                        <GoalTable />
                    </Tab>
                    <Tab title='Edit Goal'
                            eventKey="GoalF"
                    >
                        <GoalForm />
                    </Tab>
                </Tabs>
            </Tab>

            <Tab
             title={null}
             eventKey="GoalDependency" 
             active={ activeTab == 'GoalDependency' }
            >
                <h1>GoalDependency</h1>
                <Tabs key={'GoalDependency'}>
                    <Tab title='GoalDependency Chart'
                            eventKey="GoalDependencyC"
                    >
                        <GoalDependencyChart /> 
                    </Tab>     
                    <Tab title='GoalDependency Table'
                            eventKey="GoalDependencyT"
                    >
                        <GoalDependencyTable />
                    </Tab>
                    <Tab title='Edit GoalDependency'
                            eventKey="GoalDependencyF"
                    >
                        <GoalDependencyForm />
                    </Tab>
                </Tabs>
            </Tab>

            <Tab
             title={null}
             eventKey="IntegrationAccount" 
             active={ activeTab == 'IntegrationAccount' }
            >
                <h1>IntegrationAccount</h1>
                <Tabs key={'IntegrationAccount'}>
                    <Tab title='IntegrationAccount Chart'
                            eventKey="IntegrationAccountC"
                    >
                        <IntegrationAccountChart /> 
                    </Tab>     
                    <Tab title='IntegrationAccount Table'
                            eventKey="IntegrationAccountT"
                    >
                        <IntegrationAccountTable />
                    </Tab>
                    <Tab title='Edit IntegrationAccount'
                            eventKey="IntegrationAccountF"
                    >
                        <IntegrationAccountForm />
                    </Tab>
                </Tabs>
            </Tab>

            <Tab
             title={null}
             eventKey="Invoice" 
             active={ activeTab == 'Invoice' }
            >
                <h1>Invoice</h1>
                <Tabs key={'Invoice'}>
                    <Tab title='Invoice Chart'
                            eventKey="InvoiceC"
                    >
                        <InvoiceChart /> 
                    </Tab>     
                    <Tab title='Invoice Table'
                            eventKey="InvoiceT"
                    >
                        <InvoiceTable />
                    </Tab>
                    <Tab title='Edit Invoice'
                            eventKey="InvoiceF"
                    >
                        <InvoiceForm />
                    </Tab>
                </Tabs>
            </Tab>

            <Tab
             title={null}
             eventKey="KeyMetric" 
             active={ activeTab == 'KeyMetric' }
            >
                <h1>KeyMetric</h1>
                <Tabs key={'KeyMetric'}>
                    <Tab title='KeyMetric Chart'
                            eventKey="KeyMetricC"
                    >
                        <KeyMetricChart /> 
                    </Tab>     
                    <Tab title='KeyMetric Table'
                            eventKey="KeyMetricT"
                    >
                        <KeyMetricTable />
                    </Tab>
                    <Tab title='Edit KeyMetric'
                            eventKey="KeyMetricF"
                    >
                        <KeyMetricForm />
                    </Tab>
                </Tabs>
            </Tab>

            <Tab
             title={null}
             eventKey="LlmDetails" 
             active={ activeTab == 'LlmDetails' }
            >
                <h1>LlmDetails</h1>
                <Tabs key={'LlmDetails'}>
                    <Tab title='LlmDetails Chart'
                            eventKey="LlmDetailsC"
                    >
                        <LlmDetailsChart /> 
                    </Tab>     
                    <Tab title='LlmDetails Table'
                            eventKey="LlmDetailsT"
                    >
                        <LlmDetailsTable />
                    </Tab>
                    <Tab title='Edit LlmDetails'
                            eventKey="LlmDetailsF"
                    >
                        <LlmDetailsForm />
                    </Tab>
                </Tabs>
            </Tab>

            <Tab
             title={null}
             eventKey="Login" 
             active={ activeTab == 'Login' }
            >
                <h1>Login</h1>
                <Tabs key={'Login'}>
                    <Tab title='Login Chart'
                            eventKey="LoginC"
                    >
                        <LoginChart /> 
                    </Tab>     
                    <Tab title='Login Table'
                            eventKey="LoginT"
                    >
                        <LoginTable />
                    </Tab>
                    <Tab title='Edit Login'
                            eventKey="LoginF"
                    >
                        <LoginForm />
                    </Tab>
                </Tabs>
            </Tab>

            <Tab
             title={null}
             eventKey="Logout" 
             active={ activeTab == 'Logout' }
            >
                <h1>Logout</h1>
                <Tabs key={'Logout'}>
                    <Tab title='Logout Chart'
                            eventKey="LogoutC"
                    >
                        <LogoutChart /> 
                    </Tab>     
                    <Tab title='Logout Table'
                            eventKey="LogoutT"
                    >
                        <LogoutTable />
                    </Tab>
                    <Tab title='Edit Logout'
                            eventKey="LogoutF"
                    >
                        <LogoutForm />
                    </Tab>
                </Tabs>
            </Tab>

            <Tab
             title={null}
             eventKey="MediaObject" 
             active={ activeTab == 'MediaObject' }
            >
                <h1>MediaObject</h1>
                <Tabs key={'MediaObject'}>
                    <Tab title='MediaObject Chart'
                            eventKey="MediaObjectC"
                    >
                        <MediaObjectChart /> 
                    </Tab>     
                    <Tab title='MediaObject Table'
                            eventKey="MediaObjectT"
                    >
                        <MediaObjectTable />
                    </Tab>
                    <Tab title='Edit MediaObject'
                            eventKey="MediaObjectF"
                    >
                        <MediaObjectForm />
                    </Tab>
                </Tabs>
            </Tab>

            <Tab
             title={null}
             eventKey="MergeRange" 
             active={ activeTab == 'MergeRange' }
            >
                <h1>MergeRange</h1>
                <Tabs key={'MergeRange'}>
                    <Tab title='MergeRange Chart'
                            eventKey="MergeRangeC"
                    >
                        <MergeRangeChart /> 
                    </Tab>     
                    <Tab title='MergeRange Table'
                            eventKey="MergeRangeT"
                    >
                        <MergeRangeTable />
                    </Tab>
                    <Tab title='Edit MergeRange'
                            eventKey="MergeRangeF"
                    >
                        <MergeRangeForm />
                    </Tab>
                </Tabs>
            </Tab>

            <Tab
             title={null}
             eventKey="NamedRange" 
             active={ activeTab == 'NamedRange' }
            >
                <h1>NamedRange</h1>
                <Tabs key={'NamedRange'}>
                    <Tab title='NamedRange Chart'
                            eventKey="NamedRangeC"
                    >
                        <NamedRangeChart /> 
                    </Tab>     
                    <Tab title='NamedRange Table'
                            eventKey="NamedRangeT"
                    >
                        <NamedRangeTable />
                    </Tab>
                    <Tab title='Edit NamedRange'
                            eventKey="NamedRangeF"
                    >
                        <NamedRangeForm />
                    </Tab>
                </Tabs>
            </Tab>

            <Tab
             title={null}
             eventKey="Note" 
             active={ activeTab == 'Note' }
            >
                <h1>Note</h1>
                <Tabs key={'Note'}>
                    <Tab title='Note Chart'
                            eventKey="NoteC"
                    >
                        <NoteChart /> 
                    </Tab>     
                    <Tab title='Note Table'
                            eventKey="NoteT"
                    >
                        <NoteTable />
                    </Tab>
                    <Tab title='Edit Note'
                            eventKey="NoteF"
                    >
                        <NoteForm />
                    </Tab>
                </Tabs>
            </Tab>

            <Tab
             title={null}
             eventKey="OasComponents" 
             active={ activeTab == 'OasComponents' }
            >
                <h1>OasComponents</h1>
                <Tabs key={'OasComponents'}>
                    <Tab title='OasComponents Chart'
                            eventKey="OasComponentsC"
                    >
                        <OasComponentsChart /> 
                    </Tab>     
                    <Tab title='OasComponents Table'
                            eventKey="OasComponentsT"
                    >
                        <OasComponentsTable />
                    </Tab>
                    <Tab title='Edit OasComponents'
                            eventKey="OasComponentsF"
                    >
                        <OasComponentsForm />
                    </Tab>
                </Tabs>
            </Tab>

            <Tab
             title={null}
             eventKey="OasEnum" 
             active={ activeTab == 'OasEnum' }
            >
                <h1>OasEnum</h1>
                <Tabs key={'OasEnum'}>
                    <Tab title='OasEnum Chart'
                            eventKey="OasEnumC"
                    >
                        <OasEnumChart /> 
                    </Tab>     
                    <Tab title='OasEnum Table'
                            eventKey="OasEnumT"
                    >
                        <OasEnumTable />
                    </Tab>
                    <Tab title='Edit OasEnum'
                            eventKey="OasEnumF"
                    >
                        <OasEnumForm />
                    </Tab>
                </Tabs>
            </Tab>

            <Tab
             title={null}
             eventKey="OasInfo" 
             active={ activeTab == 'OasInfo' }
            >
                <h1>OasInfo</h1>
                <Tabs key={'OasInfo'}>
                    <Tab title='OasInfo Chart'
                            eventKey="OasInfoC"
                    >
                        <OasInfoChart /> 
                    </Tab>     
                    <Tab title='OasInfo Table'
                            eventKey="OasInfoT"
                    >
                        <OasInfoTable />
                    </Tab>
                    <Tab title='Edit OasInfo'
                            eventKey="OasInfoF"
                    >
                        <OasInfoForm />
                    </Tab>
                </Tabs>
            </Tab>

            <Tab
             title={null}
             eventKey="OasObjectSchema" 
             active={ activeTab == 'OasObjectSchema' }
            >
                <h1>OasObjectSchema</h1>
                <Tabs key={'OasObjectSchema'}>
                    <Tab title='OasObjectSchema Chart'
                            eventKey="OasObjectSchemaC"
                    >
                        <OasObjectSchemaChart /> 
                    </Tab>     
                    <Tab title='OasObjectSchema Table'
                            eventKey="OasObjectSchemaT"
                    >
                        <OasObjectSchemaTable />
                    </Tab>
                    <Tab title='Edit OasObjectSchema'
                            eventKey="OasObjectSchemaF"
                    >
                        <OasObjectSchemaForm />
                    </Tab>
                </Tabs>
            </Tab>

            <Tab
             title={null}
             eventKey="OasOpenAPISpec" 
             active={ activeTab == 'OasOpenAPISpec' }
            >
                <h1>OasOpenAPISpec</h1>
                <Tabs key={'OasOpenAPISpec'}>
                    <Tab title='OasOpenAPISpec Chart'
                            eventKey="OasOpenAPISpecC"
                    >
                        <OasOpenAPISpecChart /> 
                    </Tab>     
                    <Tab title='OasOpenAPISpec Table'
                            eventKey="OasOpenAPISpecT"
                    >
                        <OasOpenAPISpecTable />
                    </Tab>
                    <Tab title='Edit OasOpenAPISpec'
                            eventKey="OasOpenAPISpecF"
                    >
                        <OasOpenAPISpecForm />
                    </Tab>
                </Tabs>
            </Tab>

            <Tab
             title={null}
             eventKey="OasOperation" 
             active={ activeTab == 'OasOperation' }
            >
                <h1>OasOperation</h1>
                <Tabs key={'OasOperation'}>
                    <Tab title='OasOperation Chart'
                            eventKey="OasOperationC"
                    >
                        <OasOperationChart /> 
                    </Tab>     
                    <Tab title='OasOperation Table'
                            eventKey="OasOperationT"
                    >
                        <OasOperationTable />
                    </Tab>
                    <Tab title='Edit OasOperation'
                            eventKey="OasOperationF"
                    >
                        <OasOperationForm />
                    </Tab>
                </Tabs>
            </Tab>

            <Tab
             title={null}
             eventKey="OasParameter" 
             active={ activeTab == 'OasParameter' }
            >
                <h1>OasParameter</h1>
                <Tabs key={'OasParameter'}>
                    <Tab title='OasParameter Chart'
                            eventKey="OasParameterC"
                    >
                        <OasParameterChart /> 
                    </Tab>     
                    <Tab title='OasParameter Table'
                            eventKey="OasParameterT"
                    >
                        <OasParameterTable />
                    </Tab>
                    <Tab title='Edit OasParameter'
                            eventKey="OasParameterF"
                    >
                        <OasParameterForm />
                    </Tab>
                </Tabs>
            </Tab>

            <Tab
             title={null}
             eventKey="OasPath" 
             active={ activeTab == 'OasPath' }
            >
                <h1>OasPath</h1>
                <Tabs key={'OasPath'}>
                    <Tab title='OasPath Chart'
                            eventKey="OasPathC"
                    >
                        <OasPathChart /> 
                    </Tab>     
                    <Tab title='OasPath Table'
                            eventKey="OasPathT"
                    >
                        <OasPathTable />
                    </Tab>
                    <Tab title='Edit OasPath'
                            eventKey="OasPathF"
                    >
                        <OasPathForm />
                    </Tab>
                </Tabs>
            </Tab>

            <Tab
             title={null}
             eventKey="OasRequired" 
             active={ activeTab == 'OasRequired' }
            >
                <h1>OasRequired</h1>
                <Tabs key={'OasRequired'}>
                    <Tab title='OasRequired Chart'
                            eventKey="OasRequiredC"
                    >
                        <OasRequiredChart /> 
                    </Tab>     
                    <Tab title='OasRequired Table'
                            eventKey="OasRequiredT"
                    >
                        <OasRequiredTable />
                    </Tab>
                    <Tab title='Edit OasRequired'
                            eventKey="OasRequiredF"
                    >
                        <OasRequiredForm />
                    </Tab>
                </Tabs>
            </Tab>

            <Tab
             title={null}
             eventKey="OasResponse" 
             active={ activeTab == 'OasResponse' }
            >
                <h1>OasResponse</h1>
                <Tabs key={'OasResponse'}>
                    <Tab title='OasResponse Chart'
                            eventKey="OasResponseC"
                    >
                        <OasResponseChart /> 
                    </Tab>     
                    <Tab title='OasResponse Table'
                            eventKey="OasResponseT"
                    >
                        <OasResponseTable />
                    </Tab>
                    <Tab title='Edit OasResponse'
                            eventKey="OasResponseF"
                    >
                        <OasResponseForm />
                    </Tab>
                </Tabs>
            </Tab>

            <Tab
             title={null}
             eventKey="OasSecurityScheme" 
             active={ activeTab == 'OasSecurityScheme' }
            >
                <h1>OasSecurityScheme</h1>
                <Tabs key={'OasSecurityScheme'}>
                    <Tab title='OasSecurityScheme Chart'
                            eventKey="OasSecuritySchemeC"
                    >
                        <OasSecuritySchemeChart /> 
                    </Tab>     
                    <Tab title='OasSecurityScheme Table'
                            eventKey="OasSecuritySchemeT"
                    >
                        <OasSecuritySchemeTable />
                    </Tab>
                    <Tab title='Edit OasSecurityScheme'
                            eventKey="OasSecuritySchemeF"
                    >
                        <OasSecuritySchemeForm />
                    </Tab>
                </Tabs>
            </Tab>

            <Tab
             title={null}
             eventKey="OasServer" 
             active={ activeTab == 'OasServer' }
            >
                <h1>OasServer</h1>
                <Tabs key={'OasServer'}>
                    <Tab title='OasServer Chart'
                            eventKey="OasServerC"
                    >
                        <OasServerChart /> 
                    </Tab>     
                    <Tab title='OasServer Table'
                            eventKey="OasServerT"
                    >
                        <OasServerTable />
                    </Tab>
                    <Tab title='Edit OasServer'
                            eventKey="OasServerF"
                    >
                        <OasServerForm />
                    </Tab>
                </Tabs>
            </Tab>

            <Tab
             title={null}
             eventKey="Opportunity" 
             active={ activeTab == 'Opportunity' }
            >
                <h1>Opportunity</h1>
                <Tabs key={'Opportunity'}>
                    <Tab title='Opportunity Chart'
                            eventKey="OpportunityC"
                    >
                        <OpportunityChart /> 
                    </Tab>     
                    <Tab title='Opportunity Table'
                            eventKey="OpportunityT"
                    >
                        <OpportunityTable />
                    </Tab>
                    <Tab title='Edit Opportunity'
                            eventKey="OpportunityF"
                    >
                        <OpportunityForm />
                    </Tab>
                </Tabs>
            </Tab>

            <Tab
             title={null}
             eventKey="Organization" 
             active={ activeTab == 'Organization' }
            >
                <h1>Organization</h1>
                <Tabs key={'Organization'}>
                    <Tab title='Organization Chart'
                            eventKey="OrganizationC"
                    >
                        <OrganizationChart /> 
                    </Tab>     
                    <Tab title='Organization Table'
                            eventKey="OrganizationT"
                    >
                        <OrganizationTable />
                    </Tab>
                    <Tab title='Edit Organization'
                            eventKey="OrganizationF"
                    >
                        <OrganizationForm />
                    </Tab>
                </Tabs>
            </Tab>

            <Tab
             title={null}
             eventKey="PivotTable" 
             active={ activeTab == 'PivotTable' }
            >
                <h1>PivotTable</h1>
                <Tabs key={'PivotTable'}>
                    <Tab title='PivotTable Chart'
                            eventKey="PivotTableC"
                    >
                        <PivotTableChart /> 
                    </Tab>     
                    <Tab title='PivotTable Table'
                            eventKey="PivotTableT"
                    >
                        <PivotTableTable />
                    </Tab>
                    <Tab title='Edit PivotTable'
                            eventKey="PivotTableF"
                    >
                        <PivotTableForm />
                    </Tab>
                </Tabs>
            </Tab>

            <Tab
             title={null}
             eventKey="Principal" 
             active={ activeTab == 'Principal' }
            >
                <h1>Principal</h1>
                <Tabs key={'Principal'}>
                    <Tab title='Principal Chart'
                            eventKey="PrincipalC"
                    >
                        <PrincipalChart /> 
                    </Tab>     
                    <Tab title='Principal Table'
                            eventKey="PrincipalT"
                    >
                        <PrincipalTable />
                    </Tab>
                    <Tab title='Edit Principal'
                            eventKey="PrincipalF"
                    >
                        <PrincipalForm />
                    </Tab>
                </Tabs>
            </Tab>

            <Tab
             title={null}
             eventKey="Product" 
             active={ activeTab == 'Product' }
            >
                <h1>Product</h1>
                <Tabs key={'Product'}>
                    <Tab title='Product Chart'
                            eventKey="ProductC"
                    >
                        <ProductChart /> 
                    </Tab>     
                    <Tab title='Product Table'
                            eventKey="ProductT"
                    >
                        <ProductTable />
                    </Tab>
                    <Tab title='Edit Product'
                            eventKey="ProductF"
                    >
                        <ProductForm />
                    </Tab>
                </Tabs>
            </Tab>

            <Tab
             title={null}
             eventKey="Ptg" 
             active={ activeTab == 'Ptg' }
            >
                <h1>Ptg</h1>
                <Tabs key={'Ptg'}>
                    <Tab title='Ptg Chart'
                            eventKey="PtgC"
                    >
                        <PtgChart /> 
                    </Tab>     
                    <Tab title='Ptg Table'
                            eventKey="PtgT"
                    >
                        <PtgTable />
                    </Tab>
                    <Tab title='Edit Ptg'
                            eventKey="PtgF"
                    >
                        <PtgForm />
                    </Tab>
                </Tabs>
            </Tab>

            <Tab
             title={null}
             eventKey="PtgRef" 
             active={ activeTab == 'PtgRef' }
            >
                <h1>PtgRef</h1>
                <Tabs key={'PtgRef'}>
                    <Tab title='PtgRef Chart'
                            eventKey="PtgRefC"
                    >
                        <PtgRefChart /> 
                    </Tab>     
                    <Tab title='PtgRef Table'
                            eventKey="PtgRefT"
                    >
                        <PtgRefTable />
                    </Tab>
                    <Tab title='Edit PtgRef'
                            eventKey="PtgRefF"
                    >
                        <PtgRefForm />
                    </Tab>
                </Tabs>
            </Tab>

            <Tab
             title={null}
             eventKey="Rating" 
             active={ activeTab == 'Rating' }
            >
                <h1>Rating</h1>
                <Tabs key={'Rating'}>
                    <Tab title='Rating Chart'
                            eventKey="RatingC"
                    >
                        <RatingChart /> 
                    </Tab>     
                    <Tab title='Rating Table'
                            eventKey="RatingT"
                    >
                        <RatingTable />
                    </Tab>
                    <Tab title='Edit Rating'
                            eventKey="RatingF"
                    >
                        <RatingForm />
                    </Tab>
                </Tabs>
            </Tab>

            <Tab
             title={null}
             eventKey="Role" 
             active={ activeTab == 'Role' }
            >
                <h1>Role</h1>
                <Tabs key={'Role'}>
                    <Tab title='Role Chart'
                            eventKey="RoleC"
                    >
                        <RoleChart /> 
                    </Tab>     
                    <Tab title='Role Table'
                            eventKey="RoleT"
                    >
                        <RoleTable />
                    </Tab>
                    <Tab title='Edit Role'
                            eventKey="RoleF"
                    >
                        <RoleForm />
                    </Tab>
                </Tabs>
            </Tab>

            <Tab
             title={null}
             eventKey="SalesActivity" 
             active={ activeTab == 'SalesActivity' }
            >
                <h1>SalesActivity</h1>
                <Tabs key={'SalesActivity'}>
                    <Tab title='SalesActivity Chart'
                            eventKey="SalesActivityC"
                    >
                        <SalesActivityChart /> 
                    </Tab>     
                    <Tab title='SalesActivity Table'
                            eventKey="SalesActivityT"
                    >
                        <SalesActivityTable />
                    </Tab>
                    <Tab title='Edit SalesActivity'
                            eventKey="SalesActivityF"
                    >
                        <SalesActivityForm />
                    </Tab>
                </Tabs>
            </Tab>

            <Tab
             title={null}
             eventKey="SalesOrder" 
             active={ activeTab == 'SalesOrder' }
            >
                <h1>SalesOrder</h1>
                <Tabs key={'SalesOrder'}>
                    <Tab title='SalesOrder Chart'
                            eventKey="SalesOrderC"
                    >
                        <SalesOrderChart /> 
                    </Tab>     
                    <Tab title='SalesOrder Table'
                            eventKey="SalesOrderT"
                    >
                        <SalesOrderTable />
                    </Tab>
                    <Tab title='Edit SalesOrder'
                            eventKey="SalesOrderF"
                    >
                        <SalesOrderForm />
                    </Tab>
                </Tabs>
            </Tab>

            <Tab
             title={null}
             eventKey="SalesPipeline" 
             active={ activeTab == 'SalesPipeline' }
            >
                <h1>SalesPipeline</h1>
                <Tabs key={'SalesPipeline'}>
                    <Tab title='SalesPipeline Chart'
                            eventKey="SalesPipelineC"
                    >
                        <SalesPipelineChart /> 
                    </Tab>     
                    <Tab title='SalesPipeline Table'
                            eventKey="SalesPipelineT"
                    >
                        <SalesPipelineTable />
                    </Tab>
                    <Tab title='Edit SalesPipeline'
                            eventKey="SalesPipelineF"
                    >
                        <SalesPipelineForm />
                    </Tab>
                </Tabs>
            </Tab>

            <Tab
             title={null}
             eventKey="SecureKey" 
             active={ activeTab == 'SecureKey' }
            >
                <h1>SecureKey</h1>
                <Tabs key={'SecureKey'}>
                    <Tab title='SecureKey Chart'
                            eventKey="SecureKeyC"
                    >
                        <SecureKeyChart /> 
                    </Tab>     
                    <Tab title='SecureKey Table'
                            eventKey="SecureKeyT"
                    >
                        <SecureKeyTable />
                    </Tab>
                    <Tab title='Edit SecureKey'
                            eventKey="SecureKeyF"
                    >
                        <SecureKeyForm />
                    </Tab>
                </Tabs>
            </Tab>

            <Tab
             title={null}
             eventKey="Sheet" 
             active={ activeTab == 'Sheet' }
            >
                <h1>Sheet</h1>
                <Tabs key={'Sheet'}>
                    <Tab title='Sheet Chart'
                            eventKey="SheetC"
                    >
                        <SheetChart /> 
                    </Tab>     
                    <Tab title='Sheet Table'
                            eventKey="SheetT"
                    >
                        <SheetTable />
                    </Tab>
                    <Tab title='Edit Sheet'
                            eventKey="SheetF"
                    >
                        <SheetForm />
                    </Tab>
                </Tabs>
            </Tab>

            <Tab
             title={null}
             eventKey="SheetColumn" 
             active={ activeTab == 'SheetColumn' }
            >
                <h1>SheetColumn</h1>
                <Tabs key={'SheetColumn'}>
                    <Tab title='SheetColumn Chart'
                            eventKey="SheetColumnC"
                    >
                        <SheetColumnChart /> 
                    </Tab>     
                    <Tab title='SheetColumn Table'
                            eventKey="SheetColumnT"
                    >
                        <SheetColumnTable />
                    </Tab>
                    <Tab title='Edit SheetColumn'
                            eventKey="SheetColumnF"
                    >
                        <SheetColumnForm />
                    </Tab>
                </Tabs>
            </Tab>

            <Tab
             title={null}
             eventKey="SheetRow" 
             active={ activeTab == 'SheetRow' }
            >
                <h1>SheetRow</h1>
                <Tabs key={'SheetRow'}>
                    <Tab title='SheetRow Chart'
                            eventKey="SheetRowC"
                    >
                        <SheetRowChart /> 
                    </Tab>     
                    <Tab title='SheetRow Table'
                            eventKey="SheetRowT"
                    >
                        <SheetRowTable />
                    </Tab>
                    <Tab title='Edit SheetRow'
                            eventKey="SheetRowF"
                    >
                        <SheetRowForm />
                    </Tab>
                </Tabs>
            </Tab>

            <Tab
             title={null}
             eventKey="Solution" 
             active={ activeTab == 'Solution' }
            >
                <h1>Solution</h1>
                <Tabs key={'Solution'}>
                    <Tab title='Solution Chart'
                            eventKey="SolutionC"
                    >
                        <SolutionChart /> 
                    </Tab>     
                    <Tab title='Solution Table'
                            eventKey="SolutionT"
                    >
                        <SolutionTable />
                    </Tab>
                    <Tab title='Edit Solution'
                            eventKey="SolutionF"
                    >
                        <SolutionForm />
                    </Tab>
                </Tabs>
            </Tab>

            <Tab
             title={null}
             eventKey="StrategicPriority" 
             active={ activeTab == 'StrategicPriority' }
            >
                <h1>StrategicPriority</h1>
                <Tabs key={'StrategicPriority'}>
                    <Tab title='StrategicPriority Chart'
                            eventKey="StrategicPriorityC"
                    >
                        <StrategicPriorityChart /> 
                    </Tab>     
                    <Tab title='StrategicPriority Table'
                            eventKey="StrategicPriorityT"
                    >
                        <StrategicPriorityTable />
                    </Tab>
                    <Tab title='Edit StrategicPriority'
                            eventKey="StrategicPriorityF"
                    >
                        <StrategicPriorityForm />
                    </Tab>
                </Tabs>
            </Tab>

            <Tab
             title={null}
             eventKey="Task" 
             active={ activeTab == 'Task' }
            >
                <h1>Task</h1>
                <Tabs key={'Task'}>
                    <Tab title='Task Chart'
                            eventKey="TaskC"
                    >
                        <TaskChart /> 
                    </Tab>     
                    <Tab title='Task Table'
                            eventKey="TaskT"
                    >
                        <TaskTable />
                    </Tab>
                    <Tab title='Edit Task'
                            eventKey="TaskF"
                    >
                        <TaskForm />
                    </Tab>
                </Tabs>
            </Tab>

            <Tab
             title={null}
             eventKey="ThorUXComponent" 
             active={ activeTab == 'ThorUXComponent' }
            >
                <h1>ThorUXComponent</h1>
                <Tabs key={'ThorUXComponent'}>
                    <Tab title='ThorUXComponent Chart'
                            eventKey="ThorUXComponentC"
                    >
                        <ThorUXComponentChart /> 
                    </Tab>     
                    <Tab title='ThorUXComponent Table'
                            eventKey="ThorUXComponentT"
                    >
                        <ThorUXComponentTable />
                    </Tab>
                    <Tab title='Edit ThorUXComponent'
                            eventKey="ThorUXComponentF"
                    >
                        <ThorUXComponentForm />
                    </Tab>
                </Tabs>
            </Tab>

            <Tab
             title={null}
             eventKey="ThorUXMeta" 
             active={ activeTab == 'ThorUXMeta' }
            >
                <h1>ThorUXMeta</h1>
                <Tabs key={'ThorUXMeta'}>
                    <Tab title='ThorUXMeta Chart'
                            eventKey="ThorUXMetaC"
                    >
                        <ThorUXMetaChart /> 
                    </Tab>     
                    <Tab title='ThorUXMeta Table'
                            eventKey="ThorUXMetaT"
                    >
                        <ThorUXMetaTable />
                    </Tab>
                    <Tab title='Edit ThorUXMeta'
                            eventKey="ThorUXMetaF"
                    >
                        <ThorUXMetaForm />
                    </Tab>
                </Tabs>
            </Tab>

            <Tab
             title={null}
             eventKey="Weapon" 
             active={ activeTab == 'Weapon' }
            >
                <h1>Weapon</h1>
                <Tabs key={'Weapon'}>
                    <Tab title='Weapon Chart'
                            eventKey="WeaponC"
                    >
                        <WeaponChart /> 
                    </Tab>     
                    <Tab title='Weapon Table'
                            eventKey="WeaponT"
                    >
                        <WeaponTable />
                    </Tab>
                    <Tab title='Edit Weapon'
                            eventKey="WeaponF"
                    >
                        <WeaponForm />
                    </Tab>
                </Tabs>
            </Tab>

            <Tab
             title={null}
             eventKey="Workbook" 
             active={ activeTab == 'Workbook' }
            >
                <h1>Workbook</h1>
                <Tabs key={'Workbook'}>
                    <Tab title='Workbook Chart'
                            eventKey="WorkbookC"
                    >
                        <WorkbookChart /> 
                    </Tab>     
                    <Tab title='Workbook Table'
                            eventKey="WorkbookT"
                    >
                        <WorkbookTable />
                    </Tab>
                    <Tab title='Edit Workbook'
                            eventKey="WorkbookF"
                    >
                        <WorkbookForm />
                    </Tab>
                </Tabs>
            </Tab>

            <Tab
             title={null}
             eventKey="Workflow" 
             active={ activeTab == 'Workflow' }
            >
                <h1>Workflow</h1>
                <Tabs key={'Workflow'}>
                    <Tab title='Workflow Chart'
                            eventKey="WorkflowC"
                    >
                        <WorkflowChart /> 
                    </Tab>     
                    <Tab title='Workflow Table'
                            eventKey="WorkflowT"
                    >
                        <WorkflowTable />
                    </Tab>
                    <Tab title='Edit Workflow'
                            eventKey="WorkflowF"
                    >
                        <WorkflowForm />
                    </Tab>
                </Tabs>
            </Tab>

            <Tab
             title={null}
             eventKey="WorkflowState" 
             active={ activeTab == 'WorkflowState' }
            >
                <h1>WorkflowState</h1>
                <Tabs key={'WorkflowState'}>
                    <Tab title='WorkflowState Chart'
                            eventKey="WorkflowStateC"
                    >
                        <WorkflowStateChart /> 
                    </Tab>     
                    <Tab title='WorkflowState Table'
                            eventKey="WorkflowStateT"
                    >
                        <WorkflowStateTable />
                    </Tab>
                    <Tab title='Edit WorkflowState'
                            eventKey="WorkflowStateF"
                    >
                        <WorkflowStateForm />
                    </Tab>
                </Tabs>
            </Tab>

            </Tabs>
        </Container>
    );
};

export default DataWorkbook;
