
import { 
    getOasEnum, 
    postOasEnum,
    getOasEnumList , 
    deleteOasEnum , 
    updateOasEnum 
} from '../../api';

import {

    ADD_OASENUM_REQUEST,
    FETCH_OASENUM_REQUEST,
    LIST_OASENUM_REQUEST,
    UPDATE_OASENUM_REQUEST,
    DELETE_OASENUM_REQUEST,

    addOasEnumFailure,
    addOasEnumSuccess,

    fetchOasEnumFailure,
    fetchOasEnumSuccess,
    
    listOasEnumFailure,
    listOasEnumSuccess,

    updateOasEnumFailure,
    updateOasEnumSuccess,
    
    deleteOasEnumFailure,
    deleteOasEnumSuccess,
    
} from '../actions/OasEnumApiAction';

/**
############################## DO NOT EDIT: GENERATED FILE ##############################

Generated by CARMINA GAMES ThorAPI: https://valkyrlabs.com

Powered by Swagger Codegen: http://swagger.io

Generator version: (7.5.0)

Template file: typescript-redux-query/apiREST.mustache

############################## DO NOT EDIT: GENERATED FILE ##############################

Description: OasEnum
*/

export const OasEnumMiddleware = ({ dispatch }) => (next) => async (action) => {
    console.log("OasEnum MIDDLEWARE: " + JSON.stringify(action) )
    next(action);

    switch (action.type) {

        case ADD_OASENUM_REQUEST:
            try {
                const response = postOasEnum(action.payload);
                dispatch(addOasEnumSuccess(response.body));
            } catch (error) {
                dispatch(addOasEnumFailure(error.message));
            }
            break;

        case LIST_OASENUM_REQUEST:
            try {
                const response = getOasEnumList();
                dispatch(listOasEnumSuccess(response.body));
            } catch (error) {
                dispatch(listOasEnumFailure(error.message));
            }
            break;


        case FETCH_OASENUM_REQUEST:
            try {
                const response = getOasEnum(action.id);
                dispatch(fetchOasEnumSuccess(response.body));
            } catch (error) {
                dispatch(fetchOasEnumFailure(error.message));
            }
            break;

        case UPDATE_OASENUM_REQUEST:
            try {
                const { id, OasEnum } = action.payload;
                const response = updateOasEnum(id);
                dispatch(updateOasEnumSuccess(response.body));
            } catch (error) {
                dispatch(updateOasEnumFailure(error.message));
            }
            break;

        case DELETE_OASENUM_REQUEST:
            try {
                const { id, OasEnum } = action.payload;
                const response = deleteOasEnum(id);
                dispatch(deleteOasEnumSuccess(response.body));
            } catch (error) {
                dispatch(deleteOasEnumFailure(error.message));
            }
            break;

        default:
            break;
    }
};

