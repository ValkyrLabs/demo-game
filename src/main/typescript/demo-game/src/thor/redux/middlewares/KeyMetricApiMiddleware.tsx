
import { 
    getKeyMetric, 
    postKeyMetric,
    getKeyMetricList , 
    deleteKeyMetric , 
    updateKeyMetric 
} from '../../api';

import {

    ADD_KEYMETRIC_REQUEST,
    FETCH_KEYMETRIC_REQUEST,
    LIST_KEYMETRIC_REQUEST,
    UPDATE_KEYMETRIC_REQUEST,
    DELETE_KEYMETRIC_REQUEST,

    addKeyMetricFailure,
    addKeyMetricSuccess,

    fetchKeyMetricFailure,
    fetchKeyMetricSuccess,
    
    listKeyMetricFailure,
    listKeyMetricSuccess,

    updateKeyMetricFailure,
    updateKeyMetricSuccess,
    
    deleteKeyMetricFailure,
    deleteKeyMetricSuccess,
    
} from '../actions/KeyMetricApiAction';

/**
############################## DO NOT EDIT: GENERATED FILE ##############################

Generated by CARMINA GAMES ThorAPI: https://valkyrlabs.com

Powered by Swagger Codegen: http://swagger.io

Generator version: (7.5.0)

Template file: typescript-redux-query/apiREST.mustache

############################## DO NOT EDIT: GENERATED FILE ##############################

Description: KeyMetric
*/

export const KeyMetricMiddleware = ({ dispatch }) => (next) => async (action) => {
    console.log("KeyMetric MIDDLEWARE: " + JSON.stringify(action) )
    next(action);

    switch (action.type) {

        case ADD_KEYMETRIC_REQUEST:
            try {
                const response = postKeyMetric(action.payload);
                dispatch(addKeyMetricSuccess(response.body));
            } catch (error) {
                dispatch(addKeyMetricFailure(error.message));
            }
            break;

        case LIST_KEYMETRIC_REQUEST:
            try {
                const response = getKeyMetricList();
                dispatch(listKeyMetricSuccess(response.body));
            } catch (error) {
                dispatch(listKeyMetricFailure(error.message));
            }
            break;


        case FETCH_KEYMETRIC_REQUEST:
            try {
                const response = getKeyMetric(action.id);
                dispatch(fetchKeyMetricSuccess(response.body));
            } catch (error) {
                dispatch(fetchKeyMetricFailure(error.message));
            }
            break;

        case UPDATE_KEYMETRIC_REQUEST:
            try {
                const { id, KeyMetric } = action.payload;
                const response = updateKeyMetric(id);
                dispatch(updateKeyMetricSuccess(response.body));
            } catch (error) {
                dispatch(updateKeyMetricFailure(error.message));
            }
            break;

        case DELETE_KEYMETRIC_REQUEST:
            try {
                const { id, KeyMetric } = action.payload;
                const response = deleteKeyMetric(id);
                dispatch(deleteKeyMetricSuccess(response.body));
            } catch (error) {
                dispatch(deleteKeyMetricFailure(error.message));
            }
            break;

        default:
            break;
    }
};

