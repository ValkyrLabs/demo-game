
import { 
    getIntegrationAccount, 
    postIntegrationAccount,
    getIntegrationAccountList , 
    deleteIntegrationAccount , 
    updateIntegrationAccount 
} from '../../api';

import {

    ADD_INTEGRATIONACCOUNT_REQUEST,
    FETCH_INTEGRATIONACCOUNT_REQUEST,
    LIST_INTEGRATIONACCOUNT_REQUEST,
    UPDATE_INTEGRATIONACCOUNT_REQUEST,
    DELETE_INTEGRATIONACCOUNT_REQUEST,

    addIntegrationAccountFailure,
    addIntegrationAccountSuccess,

    fetchIntegrationAccountFailure,
    fetchIntegrationAccountSuccess,
    
    listIntegrationAccountFailure,
    listIntegrationAccountSuccess,

    updateIntegrationAccountFailure,
    updateIntegrationAccountSuccess,
    
    deleteIntegrationAccountFailure,
    deleteIntegrationAccountSuccess,
    
} from '../actions/IntegrationAccountApiAction';

/**
############################## DO NOT EDIT: GENERATED FILE ##############################

Generated by CARMINA GAMES ThorAPI: https://valkyrlabs.com

Powered by Swagger Codegen: http://swagger.io

Generator version: (7.5.0)

Template file: typescript-redux-query/apiREST.mustache

############################## DO NOT EDIT: GENERATED FILE ##############################

Description: IntegrationAccount
*/

export const IntegrationAccountMiddleware = ({ dispatch }) => (next) => async (action) => {
    console.log("IntegrationAccount MIDDLEWARE: " + JSON.stringify(action) )
    next(action);

    switch (action.type) {

        case ADD_INTEGRATIONACCOUNT_REQUEST:
            try {
                const response = postIntegrationAccount(action.payload);
                dispatch(addIntegrationAccountSuccess(response.body));
            } catch (error) {
                dispatch(addIntegrationAccountFailure(error.message));
            }
            break;

        case LIST_INTEGRATIONACCOUNT_REQUEST:
            try {
                const response = getIntegrationAccountList();
                dispatch(listIntegrationAccountSuccess(response.body));
            } catch (error) {
                dispatch(listIntegrationAccountFailure(error.message));
            }
            break;


        case FETCH_INTEGRATIONACCOUNT_REQUEST:
            try {
                const response = getIntegrationAccount(action.id);
                dispatch(fetchIntegrationAccountSuccess(response.body));
            } catch (error) {
                dispatch(fetchIntegrationAccountFailure(error.message));
            }
            break;

        case UPDATE_INTEGRATIONACCOUNT_REQUEST:
            try {
                const { id, IntegrationAccount } = action.payload;
                const response = updateIntegrationAccount(id);
                dispatch(updateIntegrationAccountSuccess(response.body));
            } catch (error) {
                dispatch(updateIntegrationAccountFailure(error.message));
            }
            break;

        case DELETE_INTEGRATIONACCOUNT_REQUEST:
            try {
                const { id, IntegrationAccount } = action.payload;
                const response = deleteIntegrationAccount(id);
                dispatch(deleteIntegrationAccountSuccess(response.body));
            } catch (error) {
                dispatch(deleteIntegrationAccountFailure(error.message));
            }
            break;

        default:
            break;
    }
};

