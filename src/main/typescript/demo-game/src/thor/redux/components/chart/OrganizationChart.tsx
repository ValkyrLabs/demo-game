import React, { useState, useEffect, useRef } from 'react';
import { DataObject, Organization } from '../../../model';
import { useGetOrganizationsQuery, useAddOrganizationMutation, useUpdateOrganizationMutation } from '../../services/OrganizationService';
import TimeSeriesChart from "../../../../components/Charts/TimeSeriesChart";
import { Spinner } from 'react-bootstrap';
/**
############################## DO NOT EDIT: GENERATED FILE ##############################

Generated by Valkyr Labs ThorAPI: https://valkyrlabs.com/thorapi

Powered by Swagger Codegen: http://swagger.io

Generated Details:
**GENERATOR VERSION:** 7.5.0
**GENERATED DATE:** 2025-01-03T16:22:47.869548-08:00[America/Los_Angeles]
**GENERATOR CLASS:** org.openapitools.codegen.languages.TypeScriptReduxQueryClientCodegen

Template file: typescript-redux-query/modelChart.mustache

############################## DO NOT EDIT: GENERATED FILE ##############################

Description: Organization

  @author John McMahon ~ github: SpaceGhost69 | twitter: @TechnoCharms
  @see https://valkyrlabs.com/docs

*/
const fieldSkipList = ['ownerId', 'keyHash', 'workflowStateId', 'createdDate', 'lastAccessedById', 'lastAccessedDate', 'lastModifiedDate', 'lastModifiedById'];

const OrganizationChart: React.FC = () => {
  const { data: initialData = [], isLoading } = useGetOrganizationsQuery();

  const [data, setData] = useState<Organization[]>([]); // Array to hold table data
  const [chartData, setChartData] = useState<Partial<Organization>>({});
  const inputRef = useRef<HTMLInputElement | null>(null);
  const [showAllFields, setShowAllFields] = useState(false);

  useEffect(() => {
    if (initialData) {
      setData(initialData);
    }
  }, [initialData]);

  const handleInputChange = (field: string, value: any) => {
    setChartData((prev) => ({
      ...prev,
      [field]: value,
    }));
  };

  const renderValue = (value: any) => {
    if (value === null || value === undefined) {
      return '';
    }
    if (typeof value === 'object') {
      return JSON.stringify(value, null, 2);
    }
    return value;
  };

  return (
    <>
          {isLoading ? (
            <Spinner animation="border" />
          ) : (
            <TimeSeriesChart data={data.flatMap((organization: DataObject) => [organization])} />
          )}
    </>
  );
};

export default OrganizationChart;
