import { ErrorMessage, Field, Formik, FormikHelpers, FormikValues } from 'formik';
import React from 'react';
import { Form as BSForm, Accordion, Col, Nav, Row, Spinner } from 'react-bootstrap';
import { FaCheckCircle, FaCogs, FaRegPlusSquare } from 'react-icons/fa';
import CoolButton from '../../../../components/CoolButton';
import * as Yup from 'yup';
import { Solution,  } from '../../../model';
import { useAddSolutionMutation } from '../../services/SolutionService';

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

Description: Solution
*/

{/* ENUMS FOR FORM VALIDATIONS */}

    



{/* MUSTACHE FORM VALIDATIONS */}
const validationSchema = Yup.object().shape({

     buildOutputId: Yup.string()
    
    
    .required('buildOutputId is required.')
    
    ,
     description: Yup.string()
    
    
    .required('description is required.')
    
    ,
    appliedFix: Yup.boolean()
    
    .oneOf([true], "The appliedFix value must be true.")
    .required('appliedFix is required.')
    
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

const SolutionForm: React.FC = () => {
  const [addSolution, addSolutionResult] = useAddSolutionMutation();

  const initialValues: Solution = {
    
    
    buildOutputId : 'null',
    
    
    
    
    
    
    
    description : 'null',
    
    
    
    
    
    
    appliedFix : undefined,
    
    
    
    
    
    
    
    
    id : 'f14540f3-10c6-4d1b-ba22-17c5c6fabdb9',
    
    
    
    
    
    
    
    ownerId : '971907f7-f8b5-404d-b27c-f716ddaf4a5c',
    
    
    
    
    
    
    
    
    createdDate : new Date(), 
    
    
    
    
    
    
    keyHash : 'null',
    
    
    
    
    
    
    
    lastAccessedById : 'de9bc283-a108-4cd8-9e84-8821995415d0',
    
    
    
    
    
    
    
    
    lastAccessedDate : new Date(), 
    
    
    
    
    
    
    lastModifiedById : '8129152a-1e89-49cc-91b1-27b1ee6db21a',
    
    
    
    
    
    
    
    
    lastModifiedDate : new Date(), 
    
    
    
    
    
  };

  const handleSubmit = (values: FormikValues,
    { setSubmitting }: FormikHelpers<Solution>) => {
    setTimeout(() => {
      console.log(values);
      addSolution(values);
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
                          addSolutionResult: {JSON.stringify(addSolutionResult)}
                        </Accordion.Body>
                      </Accordion.Item>

                      <Accordion.Item eventKey="1">
                        <Accordion.Header><FaRegPlusSquare  size={36}/> Add New Solution</Accordion.Header>
                        <Accordion.Body>

        {/* MUSTACHE FORM FIELDS */}


        
            <label htmlFor="buildOutputId" className="nice-form-control">
              <b>Build Output Id: {touched.buildOutputId && !errors.buildOutputId && (<span className="okCheck"><FaCheckCircle /> looks good!</span>)}</b>
              
              
              
          
          {/* buildOutputId  TEXT FIELD */}
              <Field name="buildOutputId" type="text"
                className={errors.buildOutputId  ? 'form-control field-error' : ' nice-form-control form-control'} />    
                        <ErrorMessage className='error' name="buildOutputId" component="span" />
            </label>


        
            <label htmlFor="description" className="nice-form-control">
              <b>Description: {touched.description && !errors.description && (<span className="okCheck"><FaCheckCircle /> looks good!</span>)}</b>
              
              
              
          
          {/* description  TEXT FIELD */}
              <Field name="description" type="text"
                className={errors.description  ? 'form-control field-error' : ' nice-form-control form-control'} />    
                        <ErrorMessage className='error' name="description" component="span" />
            </label>


        
            <label htmlFor="appliedFix" className="nice-form-control">
              <b>Applied Fix: {touched.appliedFix && !errors.appliedFix && (<span className="okCheck"><FaCheckCircle /> looks good!</span>)}</b>
              
              
              
          
          {/* CHECKBOX FIELD */}
              <BSForm.Check
                required
                id="appliedFix"
                name="appliedFix"
                onChange={e => {
                  setFieldTouched('appliedFix', true);
                  setFieldValue('appliedFix', e.target.checked);
                }}
                isInvalid={!!errors.appliedFix }                  
                className={errors.appliedFix  ? 'error ' : ''} />
              <ErrorMessage className='error' name="appliedFix" component="span" />
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
                      <FaCheckCircle size={30} /> Create New Solution
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




export default SolutionForm;