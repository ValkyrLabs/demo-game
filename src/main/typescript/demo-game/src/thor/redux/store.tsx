
/**
############################## DO NOT EDIT: GENERATED FILE ##############################

Generated by Valkyr Labs ThorAPI: https://valkyrlabs.com

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
import { AttackService } from './services/AttackService';
import { ChatMessageService } from './services/ChatMessageService';
import { ChatResponseService } from './services/ChatResponseService';
import { ContentDataService } from './services/ContentDataService';
import { ContentMediaLinkService } from './services/ContentMediaLinkService';
import { CustomerService } from './services/CustomerService';
import { EventLogService } from './services/EventLogService';
import { ExecModuleService } from './services/ExecModuleService';
import { GameService } from './services/GameService';
import { IntegrationAccountService } from './services/IntegrationAccountService';
import { LevelService } from './services/LevelService';
import { LlmDetailsService } from './services/LlmDetailsService';
import { LoginService } from './services/LoginService';
import { LogoutService } from './services/LogoutService';
import { OpportunityService } from './services/OpportunityService';
import { OrganizationService } from './services/OrganizationService';
import { PrincipalService } from './services/PrincipalService';
import { RatingService } from './services/RatingService';
import { RoleService } from './services/RoleService';
import { SalesActivityService } from './services/SalesActivityService';
import { SalesPipelineService } from './services/SalesPipelineService';
import { SecureKeyService } from './services/SecureKeyService';
import { TaskService } from './services/TaskService';
import { WeaponService } from './services/WeaponService';
import { WorkflowService } from './services/WorkflowService';
import { WorkflowStateService } from './services/WorkflowStateService';

export const getQueries = (state) => state.queries;
export const getEntities = (state) => state.entities;

const reducer = combineReducers({
  [AclEntryService.reducerPath]: AclEntryService.reducer,
  [AddressService.reducerPath]: AddressService.reducer,
  [ApplicationService.reducerPath]: ApplicationService.reducer,
  [AttackService.reducerPath]: AttackService.reducer,
  [ChatMessageService.reducerPath]: ChatMessageService.reducer,
  [ChatResponseService.reducerPath]: ChatResponseService.reducer,
  [ContentDataService.reducerPath]: ContentDataService.reducer,
  [ContentMediaLinkService.reducerPath]: ContentMediaLinkService.reducer,
  [CustomerService.reducerPath]: CustomerService.reducer,
  [EventLogService.reducerPath]: EventLogService.reducer,
  [ExecModuleService.reducerPath]: ExecModuleService.reducer,
  [GameService.reducerPath]: GameService.reducer,
  [IntegrationAccountService.reducerPath]: IntegrationAccountService.reducer,
  [LevelService.reducerPath]: LevelService.reducer,
  [LlmDetailsService.reducerPath]: LlmDetailsService.reducer,
  [LoginService.reducerPath]: LoginService.reducer,
  [LogoutService.reducerPath]: LogoutService.reducer,
  [OpportunityService.reducerPath]: OpportunityService.reducer,
  [OrganizationService.reducerPath]: OrganizationService.reducer,
  [PrincipalService.reducerPath]: PrincipalService.reducer,
  [RatingService.reducerPath]: RatingService.reducer,
  [RoleService.reducerPath]: RoleService.reducer,
  [SalesActivityService.reducerPath]: SalesActivityService.reducer,
  [SalesPipelineService.reducerPath]: SalesPipelineService.reducer,
  [SecureKeyService.reducerPath]: SecureKeyService.reducer,
  [TaskService.reducerPath]: TaskService.reducer,
  [WeaponService.reducerPath]: WeaponService.reducer,
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
    .concat(AttackService.middleware as Middleware)
    .concat(ChatMessageService.middleware as Middleware)
    .concat(ChatResponseService.middleware as Middleware)
    .concat(ContentDataService.middleware as Middleware)
    .concat(ContentMediaLinkService.middleware as Middleware)
    .concat(CustomerService.middleware as Middleware)
    .concat(EventLogService.middleware as Middleware)
    .concat(ExecModuleService.middleware as Middleware)
    .concat(GameService.middleware as Middleware)
    .concat(IntegrationAccountService.middleware as Middleware)
    .concat(LevelService.middleware as Middleware)
    .concat(LlmDetailsService.middleware as Middleware)
    .concat(LoginService.middleware as Middleware)
    .concat(LogoutService.middleware as Middleware)
    .concat(OpportunityService.middleware as Middleware)
    .concat(OrganizationService.middleware as Middleware)
    .concat(PrincipalService.middleware as Middleware)
    .concat(RatingService.middleware as Middleware)
    .concat(RoleService.middleware as Middleware)
    .concat(SalesActivityService.middleware as Middleware)
    .concat(SalesPipelineService.middleware as Middleware)
    .concat(SecureKeyService.middleware as Middleware)
    .concat(TaskService.middleware as Middleware)
    .concat(WeaponService.middleware as Middleware)
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
