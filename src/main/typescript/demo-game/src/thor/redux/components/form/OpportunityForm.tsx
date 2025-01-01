import { ErrorMessage, Field, Formik, FormikHelpers, FormikValues } from 'formik';
import React from 'react';
import { Form as BSForm, Accordion, Col, Nav, Row, Spinner } from 'react-bootstrap';
import { FaCheckCircle, FaCogs, FaRegPlusSquare } from 'react-icons/fa';
import CoolButton from '../../../../components/CoolButton';
import * as Yup from 'yup';
import { Opportunity, OpportunityCurrentStatusEnum,  } from '../../../model';
import { useAddOpportunityMutation } from '../../services/OpportunityService';

/**
############################## DO NOT EDIT: GENERATED FILE ##############################

Generated by CARMINA GAMES ThorAPI: https://valkyrlabs.com/thorapi

Powered by Swagger Codegen: http://swagger.io

Generated Details:
**GENERATOR VERSION:** 7.5.0
**GENERATED DATE:** 2024-12-30T08:46:46.125225-08:00[America/Los_Angeles]
**GENERATOR CLASS:** org.openapitools.codegen.languages.TypeScriptReduxQueryClientCodegen

Template file: typescript-redux-query/modelForm.mustache

############################## DO NOT EDIT: GENERATED FILE ##############################

Description: Opportunity
*/

{/* ENUMS FOR FORM VALIDATIONS */}

    

const CurrentStatusValidation = () => { 
  return(
    [
      'won', 'open', 'lost', 'inactive', 'revive', 'legal', 'blocked', 
    ]
  )
};



{/* MUSTACHE FORM VALIDATIONS */}
const validationSchema = Yup.object().shape({

     customerId: Yup.string()
    
    
    .required('customerId is required.')
    
    ,
     description: Yup.string()
    
    
    .required('description is required.')
    
    ,
         totalValue: Yup.number()
    
    
    
    
    ,
     currentStatus: Yup.string().oneOf(CurrentStatusValidation(), 'Invalid value selected for currentStatus')
    
    
    
    
    ,
     estimatedCloseDate: Yup.date()
    
    
    
    
    ,
     id: Yup.string()
    
    
    
    
    ,
     ownerId: Yup.string()
    
    
    
    
    ,
     createdDate: Yup.date()
    
    
    
    
    ,
     keyHash: Yup.string()
    
    
    
    
    ,
     lastAccessedById: Yup.string()
    
    
    
    
    ,
     lastAccessedDate: Yup.date()
    
    
    
    
    ,
     lastModifiedById: Yup.string()
    
    
    
    
    ,
     lastModifiedDate: Yup.date()
    
    
    
    
    ,

});

const OpportunityForm: React.FC = () => {
  const [addOpportunity, addOpportunityResult] = useAddOpportunityMutation();

  const initialValues: Opportunity = {
    
    
    customerId : 'null',
    
    
    
    
    
    
    
    description : 'null',
    
    
    
    
    
    
    
    
    
    
    
    totalValue : 0.00, 
    
        currentStatus :   OpportunityCurrentStatusEnum[Object.keys(OpportunityCurrentStatusEnum)[0]], 
    
    
    
    estimatedCloseDate : new Date(), 
    
    
    
    
    
    
    id : 'bc685533-5a7a-4b7b-8fb6-6b599bcb8511',
    
    
    
    
    
    
    
    ownerId : 'f43111dd-3f73-4567-a3c7-155ab53f01ce',
    
    
    
    
    
    
    
    
    createdDate : new Date(), 
    
    
    
    
    
    
    keyHash : 'null',
    
    
    
    
    
    
    
    lastAccessedById : '29ed92f7-346a-461a-90b2-ad422793315e',
    
    
    
    
    
    
    
    
    lastAccessedDate : new Date(), 
    
    
    
    
    
    
    lastModifiedById : '5b0e134a-a0e7-4f04-b33e-a003daee2587',
    
    
    
    
    
    
    
    
    lastModifiedDate : new Date(), 
    
    
    
    
    
  };

  const handleSubmit = (values: FormikValues,
    { setSubmitting }: FormikHelpers<Opportunity>) => {
    setTimeout(() => {
      console.log(values);
      addOpportunity(values);
      setSubmitting(false);
    }, 500);
  }

  return (
    <div>
      <Formik
        validateOnBlur={true}
        initialValues={initialValues}
        validationSchema={validationSchema}
        onSubmit={handleSubmit}
      >

        {({ isSubmitting, isValid, errors, setFieldValue, touched, setFieldTouched, handleSubmit }) => (
          <form onSubmit={handleSubmit} className="form">

                    <Accordion
                      defaultActiveKey="1"
                    >
                      <Accordion.Item eventKey="0">
                        <Accordion.Header><FaCogs size={36}/></Accordion.Header>
                        <Accordion.Body>
                          errors: {JSON.stringify(errors)}
                          <br />
                          touched: {JSON.stringify(touched)}
                          <br />
                          addOpportunityResult: {JSON.stringify(addOpportunityResult)}
                        </Accordion.Body>
                      </Accordion.Item>

                      <Accordion.Item eventKey="1">
                        <Accordion.Header><FaRegPlusSquare  size={36}/> Add New Opportunity</Accordion.Header>
                        <Accordion.Body>

        {/* MUSTACHE FORM FIELDS */}


        
            <label htmlFor="customerId" className="nice-form-control">
              <b>Customer Id: {touched.customerId && !errors.customerId && (<span className="okCheck"><FaCheckCircle /> looks good!</span>)}</b>
              
              
              
          
          {/* customerId  TEXT FIELD */}
              <Field name="customerId" type="text"
                className={errors.customerId  ? 'form-control field-error' : ' nice-form-control form-control'} />    
                        <ErrorMessage className='error' name="customerId" component="span" />
            </label>


        
            <label htmlFor="description" className="nice-form-control">
              <b>Description: {touched.description && !errors.description && (<span className="okCheck"><FaCheckCircle /> looks good!</span>)}</b>
              
              
              
          
          {/* description  TEXT FIELD */}
              <Field name="description" type="text"
                className={errors.description  ? 'form-control field-error' : ' nice-form-control form-control'} />    
                        <ErrorMessage className='error' name="description" component="span" />
            </label>


        
            <label htmlFor="totalValue" className="nice-form-control">
              <b>Total Value: {touched.totalValue && !errors.totalValue && (<span className="okCheck"><FaCheckCircle /> looks good!</span>)}</b>
              
              
              
          
          {/*totalValue DATE FIELD */}
              <Field name="totalValue" type="date"
                className={errors.totalValue  ? 'form-control field-error' : ' nice-form-control form-control'} />
                        <ErrorMessage className='error' name="totalValue" component="span" />
            </label>


        
            <label htmlFor="currentStatus" className="nice-form-control">
              <b>Current Status: {touched.currentStatus && !errors.currentStatus && (<span className="okCheck"><FaCheckCircle /> looks good!</span>)}</b>
              
              
              
                    {/* DROPDOWN FOR ENUM */}
              <BSForm.Select
                name="currentStatus"
                className={errors.currentStatus ? 'form-control field-error' : 'nice-form-control form-control'}
                onChange={e => {
                  setFieldTouched('currentStatus', true);
                  setFieldValue('currentStatus', e.target.value);
                }}
              >
                <option value="" label="Select Current Status" />
                <CurrentStatusLookup />
              </BSForm.Select>
              <ErrorMessage className='error' name="currentStatus" component="span" />
            </label>


        
            <label htmlFor="estimatedCloseDate" className="nice-form-control">
              <b>Estimated Close Date: {touched.estimatedCloseDate && !errors.estimatedCloseDate && (<span className="okCheck"><FaCheckCircle /> looks good!</span>)}</b>
              
              
              
          
          {/*estimatedCloseDate DATE FIELD */}
              <Field name="estimatedCloseDate" type="date"
                className={errors.estimatedCloseDate  ? 'form-control field-error' : ' nice-form-control form-control'} />
                        <ErrorMessage className='error' name="estimatedCloseDate" component="span" />
            </label>


        
            <label htmlFor="id" className="nice-form-control">
              <b>Id: {touched.id && !errors.id && (<span className="okCheck"><FaCheckCircle /> looks good!</span>)}</b>
              
              
              
          
          {/* id  TEXT FIELD */}
              <Field name="id" type="text"
                className={errors.id  ? 'form-control field-error' : ' nice-form-control form-control'} />    
                        <ErrorMessage className='error' name="id" component="span" />
            </label>


        
            <label htmlFor="ownerId" className="nice-form-control">
              <b>Owner Id: {touched.ownerId && !errors.ownerId && (<span className="okCheck"><FaCheckCircle /> looks good!</span>)}</b>
              
              
              
          
          {/* ownerId  TEXT FIELD */}
              <Field name="ownerId" type="text"
                className={errors.ownerId  ? 'form-control field-error' : ' nice-form-control form-control'} />    
                        <ErrorMessage className='error' name="ownerId" component="span" />
            </label>


        
            <label htmlFor="createdDate" className="nice-form-control">
              <b>Created Date: {touched.createdDate && !errors.createdDate && (<span className="okCheck"><FaCheckCircle /> looks good!</span>)}</b>
              
              
              
          
          {/*createdDate DATE FIELD */}
              <Field name="createdDate" type="date"
                className={errors.createdDate  ? 'form-control field-error' : ' nice-form-control form-control'} />
                        <ErrorMessage className='error' name="createdDate" component="span" />
            </label>


        
            <label htmlFor="keyHash" className="nice-form-control">
              <b>Key Hash: {touched.keyHash && !errors.keyHash && (<span className="okCheck"><FaCheckCircle /> looks good!</span>)}</b>
              
              
              
          
          {/* keyHash  TEXT FIELD */}
              <Field name="keyHash" type="text"
                className={errors.keyHash  ? 'form-control field-error' : ' nice-form-control form-control'} />    
                        <ErrorMessage className='error' name="keyHash" component="span" />
            </label>


        
            <label htmlFor="lastAccessedById" className="nice-form-control">
              <b>Last Accessed By Id: {touched.lastAccessedById && !errors.lastAccessedById && (<span className="okCheck"><FaCheckCircle /> looks good!</span>)}</b>
              
              
              
          
          {/* lastAccessedById  TEXT FIELD */}
              <Field name="lastAccessedById" type="text"
                className={errors.lastAccessedById  ? 'form-control field-error' : ' nice-form-control form-control'} />    
                        <ErrorMessage className='error' name="lastAccessedById" component="span" />
            </label>


        
            <label htmlFor="lastAccessedDate" className="nice-form-control">
              <b>Last Accessed Date: {touched.lastAccessedDate && !errors.lastAccessedDate && (<span className="okCheck"><FaCheckCircle /> looks good!</span>)}</b>
              
              
              
          
          {/*lastAccessedDate DATE FIELD */}
              <Field name="lastAccessedDate" type="date"
                className={errors.lastAccessedDate  ? 'form-control field-error' : ' nice-form-control form-control'} />
                        <ErrorMessage className='error' name="lastAccessedDate" component="span" />
            </label>


        
            <label htmlFor="lastModifiedById" className="nice-form-control">
              <b>Last Modified By Id: {touched.lastModifiedById && !errors.lastModifiedById && (<span className="okCheck"><FaCheckCircle /> looks good!</span>)}</b>
              
              
              
          
          {/* lastModifiedById  TEXT FIELD */}
              <Field name="lastModifiedById" type="text"
                className={errors.lastModifiedById  ? 'form-control field-error' : ' nice-form-control form-control'} />    
                        <ErrorMessage className='error' name="lastModifiedById" component="span" />
            </label>


        
            <label htmlFor="lastModifiedDate" className="nice-form-control">
              <b>Last Modified Date: {touched.lastModifiedDate && !errors.lastModifiedDate && (<span className="okCheck"><FaCheckCircle /> looks good!</span>)}</b>
              
              
              
          
          {/*lastModifiedDate DATE FIELD */}
              <Field name="lastModifiedDate" type="date"
                className={errors.lastModifiedDate  ? 'form-control field-error' : ' nice-form-control form-control'} />
                        <ErrorMessage className='error' name="lastModifiedDate" component="span" />
            </label>

 
<br /><br />

                    <CoolButton
                      variant={(touched && isValid) ? (isSubmitting ? 'disabled' : 'success') : 'warning'}
                      type="submit"
                      onClick={() => { }}
                    >
                      {isSubmitting && (
                        <Spinner
                          style={ { float: "left" } }
                          as="span"
                          animation="grow"
                          variant="light"
                          aria-hidden="true"
                        />
                      )}
                      <FaCheckCircle size={30} /> Create New Opportunity
                    </CoolButton>


                        </Accordion.Body>
                      </Accordion.Item>
                    </Accordion>

          </form>
        )}
    </Formik>
    </div >
  );
};

/*

lowercase currentstatuslookup
uppercase CURRENTSTATUSLOOKUP
snakecase current_status_lookup
pascalcase CurrentStatusLookup
camelcase currentStatusLookup
kebabcase current-status-lookup


*/

const CurrentStatusLookup = () => { 
  return(
  <>
    
    <option value='won' label='Won' />
    
    
    <option value='open' label='Open' />
    
    
    <option value='lost' label='Lost' />
    
    
    <option value='inactive' label='Inactive' />
    
    
    <option value='revive' label='Revive' />
    
    
    <option value='legal' label='Legal' />
    
    
    <option value='blocked' label='Blocked' />
    
  </>
  )
};






export default OpportunityForm;