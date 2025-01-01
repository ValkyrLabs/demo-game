
import React, { useState } from 'react';

import { Card, Col, Badge, Container, Nav, NavDropdown, Row, Tab, Tabs } from "react-bootstrap";
import CoolButton from "../../../../components/CoolButton";
import TimeSeriesChart from "../../../../components/Charts/TimeSeriesChart";
import SplitPaneView from "../../../../components/SplitPane/SplitPaneView";
import FloatingToolbar from "../../../../components/FloatingToolbar";



import  AclEntryGrid from '../grid/AclEntryGrid';



import  AddressGrid from '../grid/AddressGrid';



import  ApplicationGrid from '../grid/ApplicationGrid';



import  BackupConfigGrid from '../grid/BackupConfigGrid';



import  BlankRangeGrid from '../grid/BlankRangeGrid';



import  BorderGrid from '../grid/BorderGrid';



import  BuildGrid from '../grid/BuildGrid';



import  BuildOutputGrid from '../grid/BuildOutputGrid';



import  CampaignGrid from '../grid/CampaignGrid';



import  CellGrid from '../grid/CellGrid';



import  ChartGrid from '../grid/ChartGrid';



import  ChartSeriesGrid from '../grid/ChartSeriesGrid';



import  ChatMessageGrid from '../grid/ChatMessageGrid';



import  ChatResponseGrid from '../grid/ChatResponseGrid';



import  ContentDataGrid from '../grid/ContentDataGrid';



import  ContentMediaLinkGrid from '../grid/ContentMediaLinkGrid';



import  CustomerGrid from '../grid/CustomerGrid';



import  EventLogGrid from '../grid/EventLogGrid';



import  ExecModuleGrid from '../grid/ExecModuleGrid';



import  FormatGrid from '../grid/FormatGrid';



import  FormulaGrid from '../grid/FormulaGrid';



import  GameGrid from '../grid/GameGrid';



import  GoalGrid from '../grid/GoalGrid';



import  GoalDependencyGrid from '../grid/GoalDependencyGrid';



import  IntegrationAccountGrid from '../grid/IntegrationAccountGrid';



import  InvoiceGrid from '../grid/InvoiceGrid';



import  KeyMetricGrid from '../grid/KeyMetricGrid';



import  LlmDetailsGrid from '../grid/LlmDetailsGrid';



import  LoginGrid from '../grid/LoginGrid';



import  LogoutGrid from '../grid/LogoutGrid';



import  MediaObjectGrid from '../grid/MediaObjectGrid';



import  MergeRangeGrid from '../grid/MergeRangeGrid';



import  NamedRangeGrid from '../grid/NamedRangeGrid';



import  NoteGrid from '../grid/NoteGrid';



import  OasComponentsGrid from '../grid/OasComponentsGrid';



import  OasEnumGrid from '../grid/OasEnumGrid';



import  OasInfoGrid from '../grid/OasInfoGrid';



import  OasObjectSchemaGrid from '../grid/OasObjectSchemaGrid';



import  OasOpenAPISpecGrid from '../grid/OasOpenAPISpecGrid';



import  OasOperationGrid from '../grid/OasOperationGrid';



import  OasParameterGrid from '../grid/OasParameterGrid';



import  OasPathGrid from '../grid/OasPathGrid';



import  OasRequiredGrid from '../grid/OasRequiredGrid';



import  OasResponseGrid from '../grid/OasResponseGrid';



import  OasSecuritySchemeGrid from '../grid/OasSecuritySchemeGrid';



import  OasServerGrid from '../grid/OasServerGrid';



import  OpportunityGrid from '../grid/OpportunityGrid';



import  OrganizationGrid from '../grid/OrganizationGrid';



import  PivotTableGrid from '../grid/PivotTableGrid';



import  PrincipalGrid from '../grid/PrincipalGrid';



import  ProductGrid from '../grid/ProductGrid';



import  PtgGrid from '../grid/PtgGrid';



import  PtgRefGrid from '../grid/PtgRefGrid';



import  RatingGrid from '../grid/RatingGrid';



import  RoleGrid from '../grid/RoleGrid';



import  SalesActivityGrid from '../grid/SalesActivityGrid';



import  SalesOrderGrid from '../grid/SalesOrderGrid';



import  SalesPipelineGrid from '../grid/SalesPipelineGrid';



import  SecureKeyGrid from '../grid/SecureKeyGrid';



import  SheetGrid from '../grid/SheetGrid';



import  SheetColumnGrid from '../grid/SheetColumnGrid';



import  SheetRowGrid from '../grid/SheetRowGrid';



import  SolutionGrid from '../grid/SolutionGrid';



import  StrategicPriorityGrid from '../grid/StrategicPriorityGrid';



import  TaskGrid from '../grid/TaskGrid';



import  ThorUXComponentGrid from '../grid/ThorUXComponentGrid';



import  ThorUXMetaGrid from '../grid/ThorUXMetaGrid';



import  WeaponGrid from '../grid/WeaponGrid';



import  WorkbookGrid from '../grid/WorkbookGrid';



import  WorkflowGrid from '../grid/WorkflowGrid';



import  WorkflowStateGrid from '../grid/WorkflowStateGrid';




interface ModelCardsProps {
    addTab: (key: string, component: JSX.Element) => void;
}

const ModelCards: React.FC<ModelCardsProps> = ({ addTab }) => {

    const [activeTab, setActiveTab] = useState('');
  
    return (
        <Container fluid className="p-3 card-list">
    
                <Card className="displayCard"
                    onClick={() => {
                        addTab("AclEntry", 
                            <AclEntryGrid />
                        );
                    }}
                    key={ 'AclEntry' }
                >
                    <Card.Header className="card-header">
                    <h3>Acl Entry</h3>
                    </Card.Header>
                    <Card.Body  className="card-body">
                                
                        <Badge bg="secondary">
                            AclEntry
                        </Badge>
                    </Card.Body>
                </Card>

                <Card className="displayCard"
                    onClick={() => {
                        addTab("Address", 
                            <AddressGrid />
                        );
                    }}
                    key={ 'Address' }
                >
                    <Card.Header className="card-header">
                    <h3>Address</h3>
                    </Card.Header>
                    <Card.Body  className="card-body">
                                
                        <Badge bg="secondary">
                            Address
                        </Badge>
                    </Card.Body>
                </Card>

                <Card className="displayCard"
                    onClick={() => {
                        addTab("Application", 
                            <ApplicationGrid />
                        );
                    }}
                    key={ 'Application' }
                >
                    <Card.Header className="card-header">
                    <h3>Application</h3>
                    </Card.Header>
                    <Card.Body  className="card-body">
                                
                        <Badge bg="secondary">
                            Application
                        </Badge>
                    </Card.Body>
                </Card>

                <Card className="displayCard"
                    onClick={() => {
                        addTab("BackupConfig", 
                            <BackupConfigGrid />
                        );
                    }}
                    key={ 'BackupConfig' }
                >
                    <Card.Header className="card-header">
                    <h3>Backup Config</h3>
                    </Card.Header>
                    <Card.Body  className="card-body">
                                
                        <Badge bg="secondary">
                            BackupConfig
                        </Badge>
                    </Card.Body>
                </Card>

                <Card className="displayCard"
                    onClick={() => {
                        addTab("BlankRange", 
                            <BlankRangeGrid />
                        );
                    }}
                    key={ 'BlankRange' }
                >
                    <Card.Header className="card-header">
                    <h3>Blank Range</h3>
                    </Card.Header>
                    <Card.Body  className="card-body">
                                
                        <Badge bg="secondary">
                            BlankRange
                        </Badge>
                    </Card.Body>
                </Card>

                <Card className="displayCard"
                    onClick={() => {
                        addTab("Border", 
                            <BorderGrid />
                        );
                    }}
                    key={ 'Border' }
                >
                    <Card.Header className="card-header">
                    <h3>Border</h3>
                    </Card.Header>
                    <Card.Body  className="card-body">
                                
                        <Badge bg="secondary">
                            Border
                        </Badge>
                    </Card.Body>
                </Card>

                <Card className="displayCard"
                    onClick={() => {
                        addTab("Build", 
                            <BuildGrid />
                        );
                    }}
                    key={ 'Build' }
                >
                    <Card.Header className="card-header">
                    <h3>Build</h3>
                    </Card.Header>
                    <Card.Body  className="card-body">
                                
                        <Badge bg="secondary">
                            Build
                        </Badge>
                    </Card.Body>
                </Card>

                <Card className="displayCard"
                    onClick={() => {
                        addTab("BuildOutput", 
                            <BuildOutputGrid />
                        );
                    }}
                    key={ 'BuildOutput' }
                >
                    <Card.Header className="card-header">
                    <h3>Build Output</h3>
                    </Card.Header>
                    <Card.Body  className="card-body">
                                
                        <Badge bg="secondary">
                            BuildOutput
                        </Badge>
                    </Card.Body>
                </Card>

                <Card className="displayCard"
                    onClick={() => {
                        addTab("Campaign", 
                            <CampaignGrid />
                        );
                    }}
                    key={ 'Campaign' }
                >
                    <Card.Header className="card-header">
                    <h3>Campaign</h3>
                    </Card.Header>
                    <Card.Body  className="card-body">
                                
                        <Badge bg="secondary">
                            Campaign
                        </Badge>
                    </Card.Body>
                </Card>

                <Card className="displayCard"
                    onClick={() => {
                        addTab("Cell", 
                            <CellGrid />
                        );
                    }}
                    key={ 'Cell' }
                >
                    <Card.Header className="card-header">
                    <h3>Cell</h3>
                    </Card.Header>
                    <Card.Body  className="card-body">
                                
                        <Badge bg="secondary">
                            Cell
                        </Badge>
                    </Card.Body>
                </Card>

                <Card className="displayCard"
                    onClick={() => {
                        addTab("Chart", 
                            <ChartGrid />
                        );
                    }}
                    key={ 'Chart' }
                >
                    <Card.Header className="card-header">
                    <h3>Chart</h3>
                    </Card.Header>
                    <Card.Body  className="card-body">
                                
                        <Badge bg="secondary">
                            Chart
                        </Badge>
                    </Card.Body>
                </Card>

                <Card className="displayCard"
                    onClick={() => {
                        addTab("ChartSeries", 
                            <ChartSeriesGrid />
                        );
                    }}
                    key={ 'ChartSeries' }
                >
                    <Card.Header className="card-header">
                    <h3>Chart Series</h3>
                    </Card.Header>
                    <Card.Body  className="card-body">
                                
                        <Badge bg="secondary">
                            ChartSeries
                        </Badge>
                    </Card.Body>
                </Card>

                <Card className="displayCard"
                    onClick={() => {
                        addTab("ChatMessage", 
                            <ChatMessageGrid />
                        );
                    }}
                    key={ 'ChatMessage' }
                >
                    <Card.Header className="card-header">
                    <h3>Chat Message</h3>
                    </Card.Header>
                    <Card.Body  className="card-body">
                                
                        <Badge bg="secondary">
                            ChatMessage
                        </Badge>
                    </Card.Body>
                </Card>

                <Card className="displayCard"
                    onClick={() => {
                        addTab("ChatResponse", 
                            <ChatResponseGrid />
                        );
                    }}
                    key={ 'ChatResponse' }
                >
                    <Card.Header className="card-header">
                    <h3>Chat Response</h3>
                    </Card.Header>
                    <Card.Body  className="card-body">
                                
                        <Badge bg="secondary">
                            ChatResponse
                        </Badge>
                    </Card.Body>
                </Card>

                <Card className="displayCard"
                    onClick={() => {
                        addTab("ContentData", 
                            <ContentDataGrid />
                        );
                    }}
                    key={ 'ContentData' }
                >
                    <Card.Header className="card-header">
                    <h3>Content Data</h3>
                    </Card.Header>
                    <Card.Body  className="card-body">
                                
                        <Badge bg="secondary">
                            ContentData
                        </Badge>
                    </Card.Body>
                </Card>

                <Card className="displayCard"
                    onClick={() => {
                        addTab("ContentMediaLink", 
                            <ContentMediaLinkGrid />
                        );
                    }}
                    key={ 'ContentMediaLink' }
                >
                    <Card.Header className="card-header">
                    <h3>Content Media Link</h3>
                    </Card.Header>
                    <Card.Body  className="card-body">
                                
                        <Badge bg="secondary">
                            ContentMediaLink
                        </Badge>
                    </Card.Body>
                </Card>

                <Card className="displayCard"
                    onClick={() => {
                        addTab("Customer", 
                            <CustomerGrid />
                        );
                    }}
                    key={ 'Customer' }
                >
                    <Card.Header className="card-header">
                    <h3>Customer</h3>
                    </Card.Header>
                    <Card.Body  className="card-body">
                                
                        <Badge bg="secondary">
                            Customer
                        </Badge>
                    </Card.Body>
                </Card>

                <Card className="displayCard"
                    onClick={() => {
                        addTab("EventLog", 
                            <EventLogGrid />
                        );
                    }}
                    key={ 'EventLog' }
                >
                    <Card.Header className="card-header">
                    <h3>Event Log</h3>
                    </Card.Header>
                    <Card.Body  className="card-body">
                                
                        <Badge bg="secondary">
                            EventLog
                        </Badge>
                    </Card.Body>
                </Card>

                <Card className="displayCard"
                    onClick={() => {
                        addTab("ExecModule", 
                            <ExecModuleGrid />
                        );
                    }}
                    key={ 'ExecModule' }
                >
                    <Card.Header className="card-header">
                    <h3>Exec Module</h3>
                    </Card.Header>
                    <Card.Body  className="card-body">
                                
                        <Badge bg="secondary">
                            ExecModule
                        </Badge>
                    </Card.Body>
                </Card>

                <Card className="displayCard"
                    onClick={() => {
                        addTab("Format", 
                            <FormatGrid />
                        );
                    }}
                    key={ 'Format' }
                >
                    <Card.Header className="card-header">
                    <h3>Format</h3>
                    </Card.Header>
                    <Card.Body  className="card-body">
                                
                        <Badge bg="secondary">
                            Format
                        </Badge>
                    </Card.Body>
                </Card>

                <Card className="displayCard"
                    onClick={() => {
                        addTab("Formula", 
                            <FormulaGrid />
                        );
                    }}
                    key={ 'Formula' }
                >
                    <Card.Header className="card-header">
                    <h3>Formula</h3>
                    </Card.Header>
                    <Card.Body  className="card-body">
                                
                        <Badge bg="secondary">
                            Formula
                        </Badge>
                    </Card.Body>
                </Card>

                <Card className="displayCard"
                    onClick={() => {
                        addTab("Game", 
                            <GameGrid />
                        );
                    }}
                    key={ 'Game' }
                >
                    <Card.Header className="card-header">
                    <h3>Game</h3>
                    </Card.Header>
                    <Card.Body  className="card-body">
                                
                        <Badge bg="secondary">
                            Game
                        </Badge>
                    </Card.Body>
                </Card>

                <Card className="displayCard"
                    onClick={() => {
                        addTab("Goal", 
                            <GoalGrid />
                        );
                    }}
                    key={ 'Goal' }
                >
                    <Card.Header className="card-header">
                    <h3>Goal</h3>
                    </Card.Header>
                    <Card.Body  className="card-body">
                                
                        <Badge bg="secondary">
                            Goal
                        </Badge>
                    </Card.Body>
                </Card>

                <Card className="displayCard"
                    onClick={() => {
                        addTab("GoalDependency", 
                            <GoalDependencyGrid />
                        );
                    }}
                    key={ 'GoalDependency' }
                >
                    <Card.Header className="card-header">
                    <h3>Goal Dependency</h3>
                    </Card.Header>
                    <Card.Body  className="card-body">
                                
                        <Badge bg="secondary">
                            GoalDependency
                        </Badge>
                    </Card.Body>
                </Card>

                <Card className="displayCard"
                    onClick={() => {
                        addTab("IntegrationAccount", 
                            <IntegrationAccountGrid />
                        );
                    }}
                    key={ 'IntegrationAccount' }
                >
                    <Card.Header className="card-header">
                    <h3>Integration Account</h3>
                    </Card.Header>
                    <Card.Body  className="card-body">
                                
                        <Badge bg="secondary">
                            IntegrationAccount
                        </Badge>
                    </Card.Body>
                </Card>

                <Card className="displayCard"
                    onClick={() => {
                        addTab("Invoice", 
                            <InvoiceGrid />
                        );
                    }}
                    key={ 'Invoice' }
                >
                    <Card.Header className="card-header">
                    <h3>Invoice</h3>
                    </Card.Header>
                    <Card.Body  className="card-body">
                                
                        <Badge bg="secondary">
                            Invoice
                        </Badge>
                    </Card.Body>
                </Card>

                <Card className="displayCard"
                    onClick={() => {
                        addTab("KeyMetric", 
                            <KeyMetricGrid />
                        );
                    }}
                    key={ 'KeyMetric' }
                >
                    <Card.Header className="card-header">
                    <h3>Key Metric</h3>
                    </Card.Header>
                    <Card.Body  className="card-body">
                                
                        <Badge bg="secondary">
                            KeyMetric
                        </Badge>
                    </Card.Body>
                </Card>

                <Card className="displayCard"
                    onClick={() => {
                        addTab("LlmDetails", 
                            <LlmDetailsGrid />
                        );
                    }}
                    key={ 'LlmDetails' }
                >
                    <Card.Header className="card-header">
                    <h3>Llm Details</h3>
                    </Card.Header>
                    <Card.Body  className="card-body">
                                
                        <Badge bg="secondary">
                            LlmDetails
                        </Badge>
                    </Card.Body>
                </Card>

                <Card className="displayCard"
                    onClick={() => {
                        addTab("Login", 
                            <LoginGrid />
                        );
                    }}
                    key={ 'Login' }
                >
                    <Card.Header className="card-header">
                    <h3>Login</h3>
                    </Card.Header>
                    <Card.Body  className="card-body">
                                
                        <Badge bg="secondary">
                            Login
                        </Badge>
                    </Card.Body>
                </Card>

                <Card className="displayCard"
                    onClick={() => {
                        addTab("Logout", 
                            <LogoutGrid />
                        );
                    }}
                    key={ 'Logout' }
                >
                    <Card.Header className="card-header">
                    <h3>Logout</h3>
                    </Card.Header>
                    <Card.Body  className="card-body">
                                
                        <Badge bg="secondary">
                            Logout
                        </Badge>
                    </Card.Body>
                </Card>

                <Card className="displayCard"
                    onClick={() => {
                        addTab("MediaObject", 
                            <MediaObjectGrid />
                        );
                    }}
                    key={ 'MediaObject' }
                >
                    <Card.Header className="card-header">
                    <h3>Media Object</h3>
                    </Card.Header>
                    <Card.Body  className="card-body">
                                
                        <Badge bg="secondary">
                            MediaObject
                        </Badge>
                    </Card.Body>
                </Card>

                <Card className="displayCard"
                    onClick={() => {
                        addTab("MergeRange", 
                            <MergeRangeGrid />
                        );
                    }}
                    key={ 'MergeRange' }
                >
                    <Card.Header className="card-header">
                    <h3>Merge Range</h3>
                    </Card.Header>
                    <Card.Body  className="card-body">
                                
                        <Badge bg="secondary">
                            MergeRange
                        </Badge>
                    </Card.Body>
                </Card>

                <Card className="displayCard"
                    onClick={() => {
                        addTab("NamedRange", 
                            <NamedRangeGrid />
                        );
                    }}
                    key={ 'NamedRange' }
                >
                    <Card.Header className="card-header">
                    <h3>Named Range</h3>
                    </Card.Header>
                    <Card.Body  className="card-body">
                                
                        <Badge bg="secondary">
                            NamedRange
                        </Badge>
                    </Card.Body>
                </Card>

                <Card className="displayCard"
                    onClick={() => {
                        addTab("Note", 
                            <NoteGrid />
                        );
                    }}
                    key={ 'Note' }
                >
                    <Card.Header className="card-header">
                    <h3>Note</h3>
                    </Card.Header>
                    <Card.Body  className="card-body">
                                
                        <Badge bg="secondary">
                            Note
                        </Badge>
                    </Card.Body>
                </Card>

                <Card className="displayCard"
                    onClick={() => {
                        addTab("OasComponents", 
                            <OasComponentsGrid />
                        );
                    }}
                    key={ 'OasComponents' }
                >
                    <Card.Header className="card-header">
                    <h3>Oas Components</h3>
                    </Card.Header>
                    <Card.Body  className="card-body">
                                
                        <Badge bg="secondary">
                            OasComponents
                        </Badge>
                    </Card.Body>
                </Card>

                <Card className="displayCard"
                    onClick={() => {
                        addTab("OasEnum", 
                            <OasEnumGrid />
                        );
                    }}
                    key={ 'OasEnum' }
                >
                    <Card.Header className="card-header">
                    <h3>Oas Enum</h3>
                    </Card.Header>
                    <Card.Body  className="card-body">
                                
                        <Badge bg="secondary">
                            OasEnum
                        </Badge>
                    </Card.Body>
                </Card>

                <Card className="displayCard"
                    onClick={() => {
                        addTab("OasInfo", 
                            <OasInfoGrid />
                        );
                    }}
                    key={ 'OasInfo' }
                >
                    <Card.Header className="card-header">
                    <h3>Oas Info</h3>
                    </Card.Header>
                    <Card.Body  className="card-body">
                                
                        <Badge bg="secondary">
                            OasInfo
                        </Badge>
                    </Card.Body>
                </Card>

                <Card className="displayCard"
                    onClick={() => {
                        addTab("OasObjectSchema", 
                            <OasObjectSchemaGrid />
                        );
                    }}
                    key={ 'OasObjectSchema' }
                >
                    <Card.Header className="card-header">
                    <h3>Oas Object Schema</h3>
                    </Card.Header>
                    <Card.Body  className="card-body">
                                
                        <Badge bg="secondary">
                            OasObjectSchema
                        </Badge>
                    </Card.Body>
                </Card>

                <Card className="displayCard"
                    onClick={() => {
                        addTab("OasOpenAPISpec", 
                            <OasOpenAPISpecGrid />
                        );
                    }}
                    key={ 'OasOpenAPISpec' }
                >
                    <Card.Header className="card-header">
                    <h3>Oas Open API Spec</h3>
                    </Card.Header>
                    <Card.Body  className="card-body">
                                
                        <Badge bg="secondary">
                            OasOpenAPISpec
                        </Badge>
                    </Card.Body>
                </Card>

                <Card className="displayCard"
                    onClick={() => {
                        addTab("OasOperation", 
                            <OasOperationGrid />
                        );
                    }}
                    key={ 'OasOperation' }
                >
                    <Card.Header className="card-header">
                    <h3>Oas Operation</h3>
                    </Card.Header>
                    <Card.Body  className="card-body">
                                
                        <Badge bg="secondary">
                            OasOperation
                        </Badge>
                    </Card.Body>
                </Card>

                <Card className="displayCard"
                    onClick={() => {
                        addTab("OasParameter", 
                            <OasParameterGrid />
                        );
                    }}
                    key={ 'OasParameter' }
                >
                    <Card.Header className="card-header">
                    <h3>Oas Parameter</h3>
                    </Card.Header>
                    <Card.Body  className="card-body">
                                
                        <Badge bg="secondary">
                            OasParameter
                        </Badge>
                    </Card.Body>
                </Card>

                <Card className="displayCard"
                    onClick={() => {
                        addTab("OasPath", 
                            <OasPathGrid />
                        );
                    }}
                    key={ 'OasPath' }
                >
                    <Card.Header className="card-header">
                    <h3>Oas Path</h3>
                    </Card.Header>
                    <Card.Body  className="card-body">
                                
                        <Badge bg="secondary">
                            OasPath
                        </Badge>
                    </Card.Body>
                </Card>

                <Card className="displayCard"
                    onClick={() => {
                        addTab("OasRequired", 
                            <OasRequiredGrid />
                        );
                    }}
                    key={ 'OasRequired' }
                >
                    <Card.Header className="card-header">
                    <h3>Oas Required</h3>
                    </Card.Header>
                    <Card.Body  className="card-body">
                                
                        <Badge bg="secondary">
                            OasRequired
                        </Badge>
                    </Card.Body>
                </Card>

                <Card className="displayCard"
                    onClick={() => {
                        addTab("OasResponse", 
                            <OasResponseGrid />
                        );
                    }}
                    key={ 'OasResponse' }
                >
                    <Card.Header className="card-header">
                    <h3>Oas Response</h3>
                    </Card.Header>
                    <Card.Body  className="card-body">
                                
                        <Badge bg="secondary">
                            OasResponse
                        </Badge>
                    </Card.Body>
                </Card>

                <Card className="displayCard"
                    onClick={() => {
                        addTab("OasSecurityScheme", 
                            <OasSecuritySchemeGrid />
                        );
                    }}
                    key={ 'OasSecurityScheme' }
                >
                    <Card.Header className="card-header">
                    <h3>Oas Security Scheme</h3>
                    </Card.Header>
                    <Card.Body  className="card-body">
                                
                        <Badge bg="secondary">
                            OasSecurityScheme
                        </Badge>
                    </Card.Body>
                </Card>

                <Card className="displayCard"
                    onClick={() => {
                        addTab("OasServer", 
                            <OasServerGrid />
                        );
                    }}
                    key={ 'OasServer' }
                >
                    <Card.Header className="card-header">
                    <h3>Oas Server</h3>
                    </Card.Header>
                    <Card.Body  className="card-body">
                                
                        <Badge bg="secondary">
                            OasServer
                        </Badge>
                    </Card.Body>
                </Card>

                <Card className="displayCard"
                    onClick={() => {
                        addTab("Opportunity", 
                            <OpportunityGrid />
                        );
                    }}
                    key={ 'Opportunity' }
                >
                    <Card.Header className="card-header">
                    <h3>Opportunity</h3>
                    </Card.Header>
                    <Card.Body  className="card-body">
                                
                        <Badge bg="secondary">
                            Opportunity
                        </Badge>
                    </Card.Body>
                </Card>

                <Card className="displayCard"
                    onClick={() => {
                        addTab("Organization", 
                            <OrganizationGrid />
                        );
                    }}
                    key={ 'Organization' }
                >
                    <Card.Header className="card-header">
                    <h3>Organization</h3>
                    </Card.Header>
                    <Card.Body  className="card-body">
                                
                        <Badge bg="secondary">
                            Organization
                        </Badge>
                    </Card.Body>
                </Card>

                <Card className="displayCard"
                    onClick={() => {
                        addTab("PivotTable", 
                            <PivotTableGrid />
                        );
                    }}
                    key={ 'PivotTable' }
                >
                    <Card.Header className="card-header">
                    <h3>Pivot Table</h3>
                    </Card.Header>
                    <Card.Body  className="card-body">
                                
                        <Badge bg="secondary">
                            PivotTable
                        </Badge>
                    </Card.Body>
                </Card>

                <Card className="displayCard"
                    onClick={() => {
                        addTab("Principal", 
                            <PrincipalGrid />
                        );
                    }}
                    key={ 'Principal' }
                >
                    <Card.Header className="card-header">
                    <h3>Principal</h3>
                    </Card.Header>
                    <Card.Body  className="card-body">
                                
                        <Badge bg="secondary">
                            Principal
                        </Badge>
                    </Card.Body>
                </Card>

                <Card className="displayCard"
                    onClick={() => {
                        addTab("Product", 
                            <ProductGrid />
                        );
                    }}
                    key={ 'Product' }
                >
                    <Card.Header className="card-header">
                    <h3>Product</h3>
                    </Card.Header>
                    <Card.Body  className="card-body">
                                
                        <Badge bg="secondary">
                            Product
                        </Badge>
                    </Card.Body>
                </Card>

                <Card className="displayCard"
                    onClick={() => {
                        addTab("Ptg", 
                            <PtgGrid />
                        );
                    }}
                    key={ 'Ptg' }
                >
                    <Card.Header className="card-header">
                    <h3>Ptg</h3>
                    </Card.Header>
                    <Card.Body  className="card-body">
                                
                        <Badge bg="secondary">
                            Ptg
                        </Badge>
                    </Card.Body>
                </Card>

                <Card className="displayCard"
                    onClick={() => {
                        addTab("PtgRef", 
                            <PtgRefGrid />
                        );
                    }}
                    key={ 'PtgRef' }
                >
                    <Card.Header className="card-header">
                    <h3>Ptg Ref</h3>
                    </Card.Header>
                    <Card.Body  className="card-body">
                                
                        <Badge bg="secondary">
                            PtgRef
                        </Badge>
                    </Card.Body>
                </Card>

                <Card className="displayCard"
                    onClick={() => {
                        addTab("Rating", 
                            <RatingGrid />
                        );
                    }}
                    key={ 'Rating' }
                >
                    <Card.Header className="card-header">
                    <h3>Rating</h3>
                    </Card.Header>
                    <Card.Body  className="card-body">
                                
                        <Badge bg="secondary">
                            Rating
                        </Badge>
                    </Card.Body>
                </Card>

                <Card className="displayCard"
                    onClick={() => {
                        addTab("Role", 
                            <RoleGrid />
                        );
                    }}
                    key={ 'Role' }
                >
                    <Card.Header className="card-header">
                    <h3>Role</h3>
                    </Card.Header>
                    <Card.Body  className="card-body">
                                
                        <Badge bg="secondary">
                            Role
                        </Badge>
                    </Card.Body>
                </Card>

                <Card className="displayCard"
                    onClick={() => {
                        addTab("SalesActivity", 
                            <SalesActivityGrid />
                        );
                    }}
                    key={ 'SalesActivity' }
                >
                    <Card.Header className="card-header">
                    <h3>Sales Activity</h3>
                    </Card.Header>
                    <Card.Body  className="card-body">
                                
                        <Badge bg="secondary">
                            SalesActivity
                        </Badge>
                    </Card.Body>
                </Card>

                <Card className="displayCard"
                    onClick={() => {
                        addTab("SalesOrder", 
                            <SalesOrderGrid />
                        );
                    }}
                    key={ 'SalesOrder' }
                >
                    <Card.Header className="card-header">
                    <h3>Sales Order</h3>
                    </Card.Header>
                    <Card.Body  className="card-body">
                                
                        <Badge bg="secondary">
                            SalesOrder
                        </Badge>
                    </Card.Body>
                </Card>

                <Card className="displayCard"
                    onClick={() => {
                        addTab("SalesPipeline", 
                            <SalesPipelineGrid />
                        );
                    }}
                    key={ 'SalesPipeline' }
                >
                    <Card.Header className="card-header">
                    <h3>Sales Pipeline</h3>
                    </Card.Header>
                    <Card.Body  className="card-body">
                                
                        <Badge bg="secondary">
                            SalesPipeline
                        </Badge>
                    </Card.Body>
                </Card>

                <Card className="displayCard"
                    onClick={() => {
                        addTab("SecureKey", 
                            <SecureKeyGrid />
                        );
                    }}
                    key={ 'SecureKey' }
                >
                    <Card.Header className="card-header">
                    <h3>Secure Key</h3>
                    </Card.Header>
                    <Card.Body  className="card-body">
                                
                        <Badge bg="secondary">
                            SecureKey
                        </Badge>
                    </Card.Body>
                </Card>

                <Card className="displayCard"
                    onClick={() => {
                        addTab("Sheet", 
                            <SheetGrid />
                        );
                    }}
                    key={ 'Sheet' }
                >
                    <Card.Header className="card-header">
                    <h3>Sheet</h3>
                    </Card.Header>
                    <Card.Body  className="card-body">
                                
                        <Badge bg="secondary">
                            Sheet
                        </Badge>
                    </Card.Body>
                </Card>

                <Card className="displayCard"
                    onClick={() => {
                        addTab("SheetColumn", 
                            <SheetColumnGrid />
                        );
                    }}
                    key={ 'SheetColumn' }
                >
                    <Card.Header className="card-header">
                    <h3>Sheet Column</h3>
                    </Card.Header>
                    <Card.Body  className="card-body">
                                
                        <Badge bg="secondary">
                            SheetColumn
                        </Badge>
                    </Card.Body>
                </Card>

                <Card className="displayCard"
                    onClick={() => {
                        addTab("SheetRow", 
                            <SheetRowGrid />
                        );
                    }}
                    key={ 'SheetRow' }
                >
                    <Card.Header className="card-header">
                    <h3>Sheet Row</h3>
                    </Card.Header>
                    <Card.Body  className="card-body">
                                
                        <Badge bg="secondary">
                            SheetRow
                        </Badge>
                    </Card.Body>
                </Card>

                <Card className="displayCard"
                    onClick={() => {
                        addTab("Solution", 
                            <SolutionGrid />
                        );
                    }}
                    key={ 'Solution' }
                >
                    <Card.Header className="card-header">
                    <h3>Solution</h3>
                    </Card.Header>
                    <Card.Body  className="card-body">
                                
                        <Badge bg="secondary">
                            Solution
                        </Badge>
                    </Card.Body>
                </Card>

                <Card className="displayCard"
                    onClick={() => {
                        addTab("StrategicPriority", 
                            <StrategicPriorityGrid />
                        );
                    }}
                    key={ 'StrategicPriority' }
                >
                    <Card.Header className="card-header">
                    <h3>Strategic Priority</h3>
                    </Card.Header>
                    <Card.Body  className="card-body">
                                
                        <Badge bg="secondary">
                            StrategicPriority
                        </Badge>
                    </Card.Body>
                </Card>

                <Card className="displayCard"
                    onClick={() => {
                        addTab("Task", 
                            <TaskGrid />
                        );
                    }}
                    key={ 'Task' }
                >
                    <Card.Header className="card-header">
                    <h3>Task</h3>
                    </Card.Header>
                    <Card.Body  className="card-body">
                                
                        <Badge bg="secondary">
                            Task
                        </Badge>
                    </Card.Body>
                </Card>

                <Card className="displayCard"
                    onClick={() => {
                        addTab("ThorUXComponent", 
                            <ThorUXComponentGrid />
                        );
                    }}
                    key={ 'ThorUXComponent' }
                >
                    <Card.Header className="card-header">
                    <h3>Thor UX Component</h3>
                    </Card.Header>
                    <Card.Body  className="card-body">
                                
                        <Badge bg="secondary">
                            ThorUXComponent
                        </Badge>
                    </Card.Body>
                </Card>

                <Card className="displayCard"
                    onClick={() => {
                        addTab("ThorUXMeta", 
                            <ThorUXMetaGrid />
                        );
                    }}
                    key={ 'ThorUXMeta' }
                >
                    <Card.Header className="card-header">
                    <h3>Thor UX Meta</h3>
                    </Card.Header>
                    <Card.Body  className="card-body">
                                
                        <Badge bg="secondary">
                            ThorUXMeta
                        </Badge>
                    </Card.Body>
                </Card>

                <Card className="displayCard"
                    onClick={() => {
                        addTab("Weapon", 
                            <WeaponGrid />
                        );
                    }}
                    key={ 'Weapon' }
                >
                    <Card.Header className="card-header">
                    <h3>Weapon</h3>
                    </Card.Header>
                    <Card.Body  className="card-body">
                                
                        <Badge bg="secondary">
                            Weapon
                        </Badge>
                    </Card.Body>
                </Card>

                <Card className="displayCard"
                    onClick={() => {
                        addTab("Workbook", 
                            <WorkbookGrid />
                        );
                    }}
                    key={ 'Workbook' }
                >
                    <Card.Header className="card-header">
                    <h3>Workbook</h3>
                    </Card.Header>
                    <Card.Body  className="card-body">
                                
                        <Badge bg="secondary">
                            Workbook
                        </Badge>
                    </Card.Body>
                </Card>

                <Card className="displayCard"
                    onClick={() => {
                        addTab("Workflow", 
                            <WorkflowGrid />
                        );
                    }}
                    key={ 'Workflow' }
                >
                    <Card.Header className="card-header">
                    <h3>Workflow</h3>
                    </Card.Header>
                    <Card.Body  className="card-body">
                                
                        <Badge bg="secondary">
                            Workflow
                        </Badge>
                    </Card.Body>
                </Card>

                <Card className="displayCard"
                    onClick={() => {
                        addTab("WorkflowState", 
                            <WorkflowStateGrid />
                        );
                    }}
                    key={ 'WorkflowState' }
                >
                    <Card.Header className="card-header">
                    <h3>Workflow State</h3>
                    </Card.Header>
                    <Card.Body  className="card-body">
                                
                        <Badge bg="secondary">
                            WorkflowState
                        </Badge>
                    </Card.Body>
                </Card>

                        

        </Container>
    );
};

export default ModelCards;
