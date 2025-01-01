
import { 
    getOasInfo, 
    postOasInfo,
    getOasInfoList , 
    deleteOasInfo , 
    updateOasInfo 
} from '../../api';

import {

    ADD_OASINFO_REQUEST,
    FETCH_OASINFO_REQUEST,
    LIST_OASINFO_REQUEST,
    UPDATE_OASINFO_REQUEST,
    DELETE_OASINFO_REQUEST,

    addOasInfoFailure,
    addOasInfoSuccess,

    fetchOasInfoFailure,
    fetchOasInfoSuccess,
    
    listOasInfoFailure,
    listOasInfoSuccess,

    updateOasInfoFailure,
    updateOasInfoSuccess,
    
    deleteOasInfoFailure,
    deleteOasInfoSuccess,
    
} from '../actions/OasInfoApiAction';

/**
############################## DO NOT EDIT: GENERATED FILE ##############################

Generated by CARMINA GAMES ThorAPI: https://valkyrlabs.com

Powered by Swagger Codegen: http://swagger.io

Generator version: (7.5.0)

Template file: typescript-redux-query/apiREST.mustache

############################## DO NOT EDIT: GENERATED FILE ##############################

Description: OasInfo
*/

export const OasInfoMiddleware = ({ dispatch }) => (next) => async (action) => {
    console.log("OasInfo MIDDLEWARE: " + JSON.stringify(action) )
    next(action);

    switch (action.type) {

        case ADD_OASINFO_REQUEST:
            try {
                const response = postOasInfo(action.payload);
                dispatch(addOasInfoSuccess(response.body));
            } catch (error) {
                dispatch(addOasInfoFailure(error.message));
            }
            break;

        case LIST_OASINFO_REQUEST:
            try {
                const response = getOasInfoList();
                dispatch(listOasInfoSuccess(response.body));
            } catch (error) {
                dispatch(listOasInfoFailure(error.message));
            }
            break;


        case FETCH_OASINFO_REQUEST:
            try {
                const response = getOasInfo(action.id);
                dispatch(fetchOasInfoSuccess(response.body));
            } catch (error) {
                dispatch(fetchOasInfoFailure(error.message));
            }
            break;

        case UPDATE_OASINFO_REQUEST:
            try {
                const { id, OasInfo } = action.payload;
                const response = updateOasInfo(id);
                dispatch(updateOasInfoSuccess(response.body));
            } catch (error) {
                dispatch(updateOasInfoFailure(error.message));
            }
            break;

        case DELETE_OASINFO_REQUEST:
            try {
                const { id, OasInfo } = action.payload;
                const response = deleteOasInfo(id);
                dispatch(deleteOasInfoSuccess(response.body));
            } catch (error) {
                dispatch(deleteOasInfoFailure(error.message));
            }
            break;

        default:
            break;
    }
};
