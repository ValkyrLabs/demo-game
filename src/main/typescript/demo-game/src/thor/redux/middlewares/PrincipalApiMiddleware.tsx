
import { 
    getPrincipal, 
    postPrincipal,
    getPrincipalList , 
    deletePrincipal , 
    updatePrincipal 
} from '../../api';

import {

    ADD_PRINCIPAL_REQUEST,
    FETCH_PRINCIPAL_REQUEST,
    LIST_PRINCIPAL_REQUEST,
    UPDATE_PRINCIPAL_REQUEST,
    DELETE_PRINCIPAL_REQUEST,

    addPrincipalFailure,
    addPrincipalSuccess,

    fetchPrincipalFailure,
    fetchPrincipalSuccess,
    
    listPrincipalFailure,
    listPrincipalSuccess,

    updatePrincipalFailure,
    updatePrincipalSuccess,
    
    deletePrincipalFailure,
    deletePrincipalSuccess,
    
} from '../actions/PrincipalApiAction';

/**
############################## DO NOT EDIT: GENERATED FILE ##############################

Generated by CARMINA GAMES ThorAPI: https://valkyrlabs.com

Powered by Swagger Codegen: http://swagger.io

Generator version: (7.5.0)

Template file: typescript-redux-query/apiREST.mustache

############################## DO NOT EDIT: GENERATED FILE ##############################

Description: Principal
*/

export const PrincipalMiddleware = ({ dispatch }) => (next) => async (action) => {
    console.log("Principal MIDDLEWARE: " + JSON.stringify(action) )
    next(action);

    switch (action.type) {

        case ADD_PRINCIPAL_REQUEST:
            try {
                const response = postPrincipal(action.payload);
                dispatch(addPrincipalSuccess(response.body));
            } catch (error) {
                dispatch(addPrincipalFailure(error.message));
            }
            break;

        case LIST_PRINCIPAL_REQUEST:
            try {
                const response = getPrincipalList();
                dispatch(listPrincipalSuccess(response.body));
            } catch (error) {
                dispatch(listPrincipalFailure(error.message));
            }
            break;


        case FETCH_PRINCIPAL_REQUEST:
            try {
                const response = getPrincipal(action.id);
                dispatch(fetchPrincipalSuccess(response.body));
            } catch (error) {
                dispatch(fetchPrincipalFailure(error.message));
            }
            break;

        case UPDATE_PRINCIPAL_REQUEST:
            try {
                const { id, Principal } = action.payload;
                const response = updatePrincipal(id);
                dispatch(updatePrincipalSuccess(response.body));
            } catch (error) {
                dispatch(updatePrincipalFailure(error.message));
            }
            break;

        case DELETE_PRINCIPAL_REQUEST:
            try {
                const { id, Principal } = action.payload;
                const response = deletePrincipal(id);
                dispatch(deletePrincipalSuccess(response.body));
            } catch (error) {
                dispatch(deletePrincipalFailure(error.message));
            }
            break;

        default:
            break;
    }
};
