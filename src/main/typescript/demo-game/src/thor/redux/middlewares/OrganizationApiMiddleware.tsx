
import { 
    getOrganization, 
    postOrganization,
    getOrganizationList , 
    deleteOrganization , 
    updateOrganization 
} from '../../api';

import {

    ADD_ORGANIZATION_REQUEST,
    FETCH_ORGANIZATION_REQUEST,
    LIST_ORGANIZATION_REQUEST,
    UPDATE_ORGANIZATION_REQUEST,
    DELETE_ORGANIZATION_REQUEST,

    addOrganizationFailure,
    addOrganizationSuccess,

    fetchOrganizationFailure,
    fetchOrganizationSuccess,
    
    listOrganizationFailure,
    listOrganizationSuccess,

    updateOrganizationFailure,
    updateOrganizationSuccess,
    
    deleteOrganizationFailure,
    deleteOrganizationSuccess,
    
} from '../actions/OrganizationApiAction';

/**
############################## DO NOT EDIT: GENERATED FILE ##############################

Generated by CARMINA GAMES ThorAPI: https://valkyrlabs.com

Powered by Swagger Codegen: http://swagger.io

Generator version: (7.5.0)

Template file: typescript-redux-query/apiREST.mustache

############################## DO NOT EDIT: GENERATED FILE ##############################

Description: Organization
*/

export const OrganizationMiddleware = ({ dispatch }) => (next) => async (action) => {
    console.log("Organization MIDDLEWARE: " + JSON.stringify(action) )
    next(action);

    switch (action.type) {

        case ADD_ORGANIZATION_REQUEST:
            try {
                const response = postOrganization(action.payload);
                dispatch(addOrganizationSuccess(response.body));
            } catch (error) {
                dispatch(addOrganizationFailure(error.message));
            }
            break;

        case LIST_ORGANIZATION_REQUEST:
            try {
                const response = getOrganizationList();
                dispatch(listOrganizationSuccess(response.body));
            } catch (error) {
                dispatch(listOrganizationFailure(error.message));
            }
            break;


        case FETCH_ORGANIZATION_REQUEST:
            try {
                const response = getOrganization(action.id);
                dispatch(fetchOrganizationSuccess(response.body));
            } catch (error) {
                dispatch(fetchOrganizationFailure(error.message));
            }
            break;

        case UPDATE_ORGANIZATION_REQUEST:
            try {
                const { id, Organization } = action.payload;
                const response = updateOrganization(id);
                dispatch(updateOrganizationSuccess(response.body));
            } catch (error) {
                dispatch(updateOrganizationFailure(error.message));
            }
            break;

        case DELETE_ORGANIZATION_REQUEST:
            try {
                const { id, Organization } = action.payload;
                const response = deleteOrganization(id);
                dispatch(deleteOrganizationSuccess(response.body));
            } catch (error) {
                dispatch(deleteOrganizationFailure(error.message));
            }
            break;

        default:
            break;
    }
};
