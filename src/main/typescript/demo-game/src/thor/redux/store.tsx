
/**
############################## DO NOT EDIT: GENERATED FILE ##############################

Generated by CARMINA GAMES ThorAPI: https://valkyrlabs.com

Powered by Swagger Codegen: http://swagger.io

Generator version: (7.5.0)

Template file: typescript-redux-query/store.mustache

############################## DO NOT EDIT: GENERATED FILE ##############################

Description: 
*/

import { Middleware, combineReducers, configureStore } from "@reduxjs/toolkit";
import { exists, mapValues } from '../src/runtime';

// IMPORTant
import { AclEntryService } from './services/AclEntryService';
import { AddressService } from './services/AddressService';
import { ApplicationService } from './services/ApplicationService';
import { BackupConfigService } from './services/BackupConfigService';
import { BlankRangeService } from './services/BlankRangeService';
import { BorderService } from './services/BorderService';
import { BuildService } from './services/BuildService';
import { BuildOutputService } from './services/BuildOutputService';
import { CampaignService } from './services/CampaignService';
import { CellService } from './services/CellService';
import { ChartService } from './services/ChartService';
import { ChartSeriesService } from './services/ChartSeriesService';
import { ChatMessageService } from './services/ChatMessageService';
import { ChatResponseService } from './services/ChatResponseService';
import { ContentDataService } from './services/ContentDataService';
import { ContentMediaLinkService } from './services/ContentMediaLinkService';
import { CustomerService } from './services/CustomerService';
import { EventLogService } from './services/EventLogService';
import { ExecModuleService } from './services/ExecModuleService';
import { FormatService } from './services/FormatService';
import { FormulaService } from './services/FormulaService';
import { GameService } from './services/GameService';
import { GoalService } from './services/GoalService';
import { GoalDependencyService } from './services/GoalDependencyService';
import { IntegrationAccountService } from './services/IntegrationAccountService';
import { InvoiceService } from './services/InvoiceService';
import { KeyMetricService } from './services/KeyMetricService';
import { LlmDetailsService } from './services/LlmDetailsService';
import { LoginService } from './services/LoginService';
import { LogoutService } from './services/LogoutService';
import { MediaObjectService } from './services/MediaObjectService';
import { MergeRangeService } from './services/MergeRangeService';
import { NamedRangeService } from './services/NamedRangeService';
import { NoteService } from './services/NoteService';
import { OasComponentsService } from './services/OasComponentsService';
import { OasEnumService } from './services/OasEnumService';
import { OasInfoService } from './services/OasInfoService';
import { OasObjectSchemaService } from './services/OasObjectSchemaService';
import { OasOpenAPISpecService } from './services/OasOpenAPISpecService';
import { OasOperationService } from './services/OasOperationService';
import { OasParameterService } from './services/OasParameterService';
import { OasPathService } from './services/OasPathService';
import { OasRequiredService } from './services/OasRequiredService';
import { OasResponseService } from './services/OasResponseService';
import { OasSecuritySchemeService } from './services/OasSecuritySchemeService';
import { OasServerService } from './services/OasServerService';
import { OpportunityService } from './services/OpportunityService';
import { OrganizationService } from './services/OrganizationService';
import { PivotTableService } from './services/PivotTableService';
import { PrincipalService } from './services/PrincipalService';
import { ProductService } from './services/ProductService';
import { PtgService } from './services/PtgService';
import { PtgRefService } from './services/PtgRefService';
import { RatingService } from './services/RatingService';
import { RoleService } from './services/RoleService';
import { SalesActivityService } from './services/SalesActivityService';
import { SalesOrderService } from './services/SalesOrderService';
import { SalesPipelineService } from './services/SalesPipelineService';
import { SecureKeyService } from './services/SecureKeyService';
import { SheetService } from './services/SheetService';
import { SheetColumnService } from './services/SheetColumnService';
import { SheetRowService } from './services/SheetRowService';
import { SolutionService } from './services/SolutionService';
import { StrategicPriorityService } from './services/StrategicPriorityService';
import { TaskService } from './services/TaskService';
import { ThorUXComponentService } from './services/ThorUXComponentService';
import { ThorUXMetaService } from './services/ThorUXMetaService';
import { WeaponService } from './services/WeaponService';
import { WorkbookService } from './services/WorkbookService';
import { WorkflowService } from './services/WorkflowService';
import { WorkflowStateService } from './services/WorkflowStateService';

export const getQueries = (state) => state.queries;
export const getEntities = (state) => state.entities;

const reducer = combineReducers({
  [AclEntryService.reducerPath]: AclEntryService.reducer,
  [AddressService.reducerPath]: AddressService.reducer,
  [ApplicationService.reducerPath]: ApplicationService.reducer,
  [BackupConfigService.reducerPath]: BackupConfigService.reducer,
  [BlankRangeService.reducerPath]: BlankRangeService.reducer,
  [BorderService.reducerPath]: BorderService.reducer,
  [BuildService.reducerPath]: BuildService.reducer,
  [BuildOutputService.reducerPath]: BuildOutputService.reducer,
  [CampaignService.reducerPath]: CampaignService.reducer,
  [CellService.reducerPath]: CellService.reducer,
  [ChartService.reducerPath]: ChartService.reducer,
  [ChartSeriesService.reducerPath]: ChartSeriesService.reducer,
  [ChatMessageService.reducerPath]: ChatMessageService.reducer,
  [ChatResponseService.reducerPath]: ChatResponseService.reducer,
  [ContentDataService.reducerPath]: ContentDataService.reducer,
  [ContentMediaLinkService.reducerPath]: ContentMediaLinkService.reducer,
  [CustomerService.reducerPath]: CustomerService.reducer,
  [EventLogService.reducerPath]: EventLogService.reducer,
  [ExecModuleService.reducerPath]: ExecModuleService.reducer,
  [FormatService.reducerPath]: FormatService.reducer,
  [FormulaService.reducerPath]: FormulaService.reducer,
  [GameService.reducerPath]: GameService.reducer,
  [GoalService.reducerPath]: GoalService.reducer,
  [GoalDependencyService.reducerPath]: GoalDependencyService.reducer,
  [IntegrationAccountService.reducerPath]: IntegrationAccountService.reducer,
  [InvoiceService.reducerPath]: InvoiceService.reducer,
  [KeyMetricService.reducerPath]: KeyMetricService.reducer,
  [LlmDetailsService.reducerPath]: LlmDetailsService.reducer,
  [LoginService.reducerPath]: LoginService.reducer,
  [LogoutService.reducerPath]: LogoutService.reducer,
  [MediaObjectService.reducerPath]: MediaObjectService.reducer,
  [MergeRangeService.reducerPath]: MergeRangeService.reducer,
  [NamedRangeService.reducerPath]: NamedRangeService.reducer,
  [NoteService.reducerPath]: NoteService.reducer,
  [OasComponentsService.reducerPath]: OasComponentsService.reducer,
  [OasEnumService.reducerPath]: OasEnumService.reducer,
  [OasInfoService.reducerPath]: OasInfoService.reducer,
  [OasObjectSchemaService.reducerPath]: OasObjectSchemaService.reducer,
  [OasOpenAPISpecService.reducerPath]: OasOpenAPISpecService.reducer,
  [OasOperationService.reducerPath]: OasOperationService.reducer,
  [OasParameterService.reducerPath]: OasParameterService.reducer,
  [OasPathService.reducerPath]: OasPathService.reducer,
  [OasRequiredService.reducerPath]: OasRequiredService.reducer,
  [OasResponseService.reducerPath]: OasResponseService.reducer,
  [OasSecuritySchemeService.reducerPath]: OasSecuritySchemeService.reducer,
  [OasServerService.reducerPath]: OasServerService.reducer,
  [OpportunityService.reducerPath]: OpportunityService.reducer,
  [OrganizationService.reducerPath]: OrganizationService.reducer,
  [PivotTableService.reducerPath]: PivotTableService.reducer,
  [PrincipalService.reducerPath]: PrincipalService.reducer,
  [ProductService.reducerPath]: ProductService.reducer,
  [PtgService.reducerPath]: PtgService.reducer,
  [PtgRefService.reducerPath]: PtgRefService.reducer,
  [RatingService.reducerPath]: RatingService.reducer,
  [RoleService.reducerPath]: RoleService.reducer,
  [SalesActivityService.reducerPath]: SalesActivityService.reducer,
  [SalesOrderService.reducerPath]: SalesOrderService.reducer,
  [SalesPipelineService.reducerPath]: SalesPipelineService.reducer,
  [SecureKeyService.reducerPath]: SecureKeyService.reducer,
  [SheetService.reducerPath]: SheetService.reducer,
  [SheetColumnService.reducerPath]: SheetColumnService.reducer,
  [SheetRowService.reducerPath]: SheetRowService.reducer,
  [SolutionService.reducerPath]: SolutionService.reducer,
  [StrategicPriorityService.reducerPath]: StrategicPriorityService.reducer,
  [TaskService.reducerPath]: TaskService.reducer,
  [ThorUXComponentService.reducerPath]: ThorUXComponentService.reducer,
  [ThorUXMetaService.reducerPath]: ThorUXMetaService.reducer,
  [WeaponService.reducerPath]: WeaponService.reducer,
  [WorkbookService.reducerPath]: WorkbookService.reducer,
  [WorkflowService.reducerPath]: WorkflowService.reducer,
  [WorkflowStateService.reducerPath]: WorkflowStateService.reducer,
});

export const store = configureStore({
  reducer,
  middleware: (getDefaultMiddleware) =>
    getDefaultMiddleware()
    .concat(AclEntryService.middleware as Middleware)
    .concat(AddressService.middleware as Middleware)
    .concat(ApplicationService.middleware as Middleware)
    .concat(BackupConfigService.middleware as Middleware)
    .concat(BlankRangeService.middleware as Middleware)
    .concat(BorderService.middleware as Middleware)
    .concat(BuildService.middleware as Middleware)
    .concat(BuildOutputService.middleware as Middleware)
    .concat(CampaignService.middleware as Middleware)
    .concat(CellService.middleware as Middleware)
    .concat(ChartService.middleware as Middleware)
    .concat(ChartSeriesService.middleware as Middleware)
    .concat(ChatMessageService.middleware as Middleware)
    .concat(ChatResponseService.middleware as Middleware)
    .concat(ContentDataService.middleware as Middleware)
    .concat(ContentMediaLinkService.middleware as Middleware)
    .concat(CustomerService.middleware as Middleware)
    .concat(EventLogService.middleware as Middleware)
    .concat(ExecModuleService.middleware as Middleware)
    .concat(FormatService.middleware as Middleware)
    .concat(FormulaService.middleware as Middleware)
    .concat(GameService.middleware as Middleware)
    .concat(GoalService.middleware as Middleware)
    .concat(GoalDependencyService.middleware as Middleware)
    .concat(IntegrationAccountService.middleware as Middleware)
    .concat(InvoiceService.middleware as Middleware)
    .concat(KeyMetricService.middleware as Middleware)
    .concat(LlmDetailsService.middleware as Middleware)
    .concat(LoginService.middleware as Middleware)
    .concat(LogoutService.middleware as Middleware)
    .concat(MediaObjectService.middleware as Middleware)
    .concat(MergeRangeService.middleware as Middleware)
    .concat(NamedRangeService.middleware as Middleware)
    .concat(NoteService.middleware as Middleware)
    .concat(OasComponentsService.middleware as Middleware)
    .concat(OasEnumService.middleware as Middleware)
    .concat(OasInfoService.middleware as Middleware)
    .concat(OasObjectSchemaService.middleware as Middleware)
    .concat(OasOpenAPISpecService.middleware as Middleware)
    .concat(OasOperationService.middleware as Middleware)
    .concat(OasParameterService.middleware as Middleware)
    .concat(OasPathService.middleware as Middleware)
    .concat(OasRequiredService.middleware as Middleware)
    .concat(OasResponseService.middleware as Middleware)
    .concat(OasSecuritySchemeService.middleware as Middleware)
    .concat(OasServerService.middleware as Middleware)
    .concat(OpportunityService.middleware as Middleware)
    .concat(OrganizationService.middleware as Middleware)
    .concat(PivotTableService.middleware as Middleware)
    .concat(PrincipalService.middleware as Middleware)
    .concat(ProductService.middleware as Middleware)
    .concat(PtgService.middleware as Middleware)
    .concat(PtgRefService.middleware as Middleware)
    .concat(RatingService.middleware as Middleware)
    .concat(RoleService.middleware as Middleware)
    .concat(SalesActivityService.middleware as Middleware)
    .concat(SalesOrderService.middleware as Middleware)
    .concat(SalesPipelineService.middleware as Middleware)
    .concat(SecureKeyService.middleware as Middleware)
    .concat(SheetService.middleware as Middleware)
    .concat(SheetColumnService.middleware as Middleware)
    .concat(SheetRowService.middleware as Middleware)
    .concat(SolutionService.middleware as Middleware)
    .concat(StrategicPriorityService.middleware as Middleware)
    .concat(TaskService.middleware as Middleware)
    .concat(ThorUXComponentService.middleware as Middleware)
    .concat(ThorUXMetaService.middleware as Middleware)
    .concat(WeaponService.middleware as Middleware)
    .concat(WorkbookService.middleware as Middleware)
    .concat(WorkflowService.middleware as Middleware)
    .concat(WorkflowStateService.middleware as Middleware)
});

// see `setupListeners` docs - takes an optional callback as the 2nd arg for customization
// setupListeners(store.dispatch)

export default store;

// Get the type of our store variable
export type AppStore = typeof store;

// Infer the `RootState` and `AppDispatch` types from the store itself
export type RootState = ReturnType<AppStore["getState"]>;

// Inferred type: {posts: PostsState, comments: CommentsState, users: UsersState}
export type AppDispatch = AppStore["dispatch"];
