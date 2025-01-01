
import { 
    getOasObjectSchema, 
    postOasObjectSchema,
    getOasObjectSchemaList , 
    deleteOasObjectSchema , 
    updateOasObjectSchema 
} from '../../api';

import {

    ADD_OASOBJECTSCHEMA_REQUEST,
    FETCH_OASOBJECTSCHEMA_REQUEST,
    LIST_OASOBJECTSCHEMA_REQUEST,
    UPDATE_OASOBJECTSCHEMA_REQUEST,
    DELETE_OASOBJECTSCHEMA_REQUEST,

    addOasObjectSchemaFailure,
    addOasObjectSchemaSuccess,

    fetchOasObjectSchemaFailure,
    fetchOasObjectSchemaSuccess,
    
    listOasObjectSchemaFailure,
    listOasObjectSchemaSuccess,

    updateOasObjectSchemaFailure,
    updateOasObjectSchemaSuccess,
    
    deleteOasObjectSchemaFailure,
    deleteOasObjectSchemaSuccess,
    
} from '../actions/OasObjectSchemaApiAction';

/**
############################## DO NOT EDIT: GENERATED FILE ##############################

Generated by CARMINA GAMES ThorAPI: https://valkyrlabs.com

Powered by Swagger Codegen: http://swagger.io

Generator version: (7.5.0)

Template file: typescript-redux-query/apiREST.mustache

############################## DO NOT EDIT: GENERATED FILE ##############################

Description: OasObjectSchema
*/

export const OasObjectSchemaMiddleware = ({ dispatch }) => (next) => async (action) => {
    console.log("OasObjectSchema MIDDLEWARE: " + JSON.stringify(action) )
    next(action);

    switch (action.type) {

        case ADD_OASOBJECTSCHEMA_REQUEST:
            try {
                const response = postOasObjectSchema(action.payload);
                dispatch(addOasObjectSchemaSuccess(response.body));
            } catch (error) {
                dispatch(addOasObjectSchemaFailure(error.message));
            }
            break;

        case LIST_OASOBJECTSCHEMA_REQUEST:
            try {
                const response = getOasObjectSchemaList();
                dispatch(listOasObjectSchemaSuccess(response.body));
            } catch (error) {
                dispatch(listOasObjectSchemaFailure(error.message));
            }
            break;


        case FETCH_OASOBJECTSCHEMA_REQUEST:
            try {
                const response = getOasObjectSchema(action.id);
                dispatch(fetchOasObjectSchemaSuccess(response.body));
            } catch (error) {
                dispatch(fetchOasObjectSchemaFailure(error.message));
            }
            break;

        case UPDATE_OASOBJECTSCHEMA_REQUEST:
            try {
                const { id, OasObjectSchema } = action.payload;
                const response = updateOasObjectSchema(id);
                dispatch(updateOasObjectSchemaSuccess(response.body));
            } catch (error) {
                dispatch(updateOasObjectSchemaFailure(error.message));
            }
            break;

        case DELETE_OASOBJECTSCHEMA_REQUEST:
            try {
                const { id, OasObjectSchema } = action.payload;
                const response = deleteOasObjectSchema(id);
                dispatch(deleteOasObjectSchemaSuccess(response.body));
            } catch (error) {
                dispatch(deleteOasObjectSchemaFailure(error.message));
            }
            break;

        default:
            break;
    }
};
